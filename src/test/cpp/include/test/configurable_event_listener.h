#include "gtest/gtest.h"

using namespace testing;

class ConfigurableEventListener : public TestEventListener {

    private:
        TestEventListener* eventListener;

        /**
         * Show the names of each test case.
         */
        bool showTestCases = false;

        /**
         * Show the names of each test.
         */
        bool showTestNames = false;

        /**
         * Show each success.
         */
        bool showSuccesses = false;

        /**
         * Show each failure as it occurs. You will also see it at the bottom after the full suite is run.
         */
        bool showInlineFailures = false;

        /**
         * Show the setup of the global environment.
         */
        bool showEnvironment = false;

        ConfigurableEventListener(TestEventListener* eventListener, const bool showTestCases, const bool showTestNames,
                                  const bool showSuccesses, const bool showInlineFailures, const bool showEnvironment)
                                  : eventListener(eventListener), showTestCases(showTestCases),
                                  showTestNames(showTestNames), showSuccesses(showSuccesses),
                                  showInlineFailures(showInlineFailures), showEnvironment(showEnvironment) { }

    public:
        class Builder;

        virtual ~ConfigurableEventListener() {
            delete this->eventListener;
        }

        virtual void OnTestProgramStart(const UnitTest& unit_test) {
            this->eventListener->OnTestProgramStart(unit_test);
        }

        virtual void OnTestIterationStart(const UnitTest& unit_test, int iteration) {
            this->eventListener->OnTestIterationStart(unit_test, iteration);
        }

        virtual void OnEnvironmentsSetUpStart(const UnitTest& unit_test) {
            if (showEnvironment) {
                this->eventListener->OnEnvironmentsSetUpStart(unit_test);
            }
        }

        virtual void OnEnvironmentsSetUpEnd(const UnitTest& unit_test) {
            if (showEnvironment) {
               this->eventListener->OnEnvironmentsSetUpEnd(unit_test);
            }
        }

        virtual void OnTestCaseStart(const TestCase& test_case) {
            if (showTestCases) {
                this->eventListener->OnTestCaseStart(test_case);
            }
        }

        virtual void OnTestStart(const TestInfo& test_info) {
            if (showTestNames) {
                this->eventListener->OnTestStart(test_info);
            }
        }

        virtual void OnTestPartResult(const TestPartResult& result) {
            this->eventListener->OnTestPartResult(result);
        }

        virtual void OnTestEnd(const TestInfo& test_info) {
            if ((showInlineFailures && test_info.result()->Failed())
                    || (showSuccesses && !test_info.result()->Failed())) {
                this->eventListener->OnTestEnd(test_info);
            }
        }

        virtual void OnTestCaseEnd(const TestCase& test_case) {
            if (showTestCases) {
                this->eventListener->OnTestCaseEnd(test_case);
            }
        }

        virtual void OnEnvironmentsTearDownStart(const UnitTest& unit_test) {
            if (showEnvironment) {
                this->eventListener->OnEnvironmentsTearDownStart(unit_test);
            }
        }

        virtual void OnEnvironmentsTearDownEnd(const UnitTest& unit_test) {
            if (showEnvironment) {
                this->eventListener->OnEnvironmentsTearDownEnd(unit_test);
            }
        }

        virtual void OnTestIterationEnd(const UnitTest& unit_test, int iteration) {
            this->eventListener->OnTestIterationEnd(unit_test, iteration);
        }

        virtual void OnTestProgramEnd(const UnitTest& unit_test) {
            this->eventListener->OnTestProgramEnd(unit_test);
        }
};

class ConfigurableEventListener::Builder {
    private:
        TestEventListener* eventListener;
        bool testCases = false;
        bool testNames = false;
        bool successes = false;
        bool inlineFailures = false;
        bool environment = false;

    public:
        Builder(TestEventListener* eventListener) {
            this->eventListener = eventListener;
        }

        Builder showTestCases() {
            this->testCases = true;
            return *this;
        }

        Builder showTestNames() {
            this->testNames = true;
            return *this;
        }

        Builder showSuccesses() {
            this->successes = true;
            return *this;
        }

        Builder showInlineFailures() {
            this->inlineFailures = true;
            return *this;
        }

        Builder showEnvironment() {
            this->environment = true;
            return *this;
        }

        ConfigurableEventListener* build() {
            return new ConfigurableEventListener(this->eventListener, this->testCases, this->testNames,
                        this->successes, this->inlineFailures, this->environment);
        }
};
