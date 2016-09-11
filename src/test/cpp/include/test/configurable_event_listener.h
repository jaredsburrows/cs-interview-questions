#include <gtest/gtest.h>

using namespace testing;

/**
 * Custom TestEventListener that only prints out failed test. The methods are organized
 * in the order the corresponding events are fired.
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class ConfigurableEventListener : public TestEventListener {
  private:
    TestEventListener* eventListener;
    const bool showProgramStartEnd = false;
    const bool showIterationsStartEnd = false;
    const bool showTestCases = false;
    const bool showTestNames = false;
    const bool showSuccesses = false;
    const bool showFailures = false;
    const bool showInlineFailures = false;
    const bool showEnvironment = false;

    ConfigurableEventListener(TestEventListener* eventListener, const bool showProgramStartEnd,
                              const bool showIterationsStartEnd, const bool showTestCases,
                              const bool showTestNames, const bool showSuccesses,
                              const bool showFailures, const bool showInlineFailures,
                              const bool showEnvironment)
        : eventListener(eventListener), showProgramStartEnd(showProgramStartEnd),
          showIterationsStartEnd(showIterationsStartEnd), showTestCases(showTestCases),
          showTestNames(showTestNames), showSuccesses(showSuccesses),
          showFailures(showFailures), showInlineFailures(showInlineFailures),
          showEnvironment(showEnvironment) { }

  public:
    // Helpful builder for setting up the TestEventListener
    class Builder;

    // Decontructor
    virtual ~ConfigurableEventListener() override {
        delete this->eventListener;
    }

    // Fired before any test activity starts.
    virtual void OnTestProgramStart(const UnitTest& unit_test) override {
        if (this->showProgramStartEnd) {
            this->eventListener->OnTestProgramStart(unit_test);
        }
    }

    // Fired before each iteration of tests starts.  There may be more than
    // one iteration if GTEST_FLAG(repeat) is set. iteration is the iteration
    // index, starting from 0.
    virtual void OnTestIterationStart(const UnitTest& unit_test, int iteration) override {
        if (this->showIterationsStartEnd) {
            this->eventListener->OnTestIterationStart(unit_test, iteration);
        }
    }

    // Fired before environment set-up for each iteration of tests starts.
    virtual void OnEnvironmentsSetUpStart(const UnitTest& unit_test) override {
        if (this->showEnvironment) {
            this->eventListener->OnEnvironmentsSetUpStart(unit_test);
        }
    }

    // Fired after environment set-up for each iteration of tests ends.
    virtual void OnEnvironmentsSetUpEnd(const UnitTest& unit_test) override {
        if (this->showEnvironment) {
            this->eventListener->OnEnvironmentsSetUpEnd(unit_test);
        }
    }

    // Fired before the test case starts.
    virtual void OnTestCaseStart(const TestCase& test_case) override {
        if (this->showTestCases) {
            this->eventListener->OnTestCaseStart(test_case);
        }
    }

    // Fired before the test starts.
    virtual void OnTestStart(const TestInfo& test_info) override {
        if (this->showTestNames) {
            this->eventListener->OnTestStart(test_info);
        }
    }

    // Fired after a failed assertion or a SUCCEED() invocation.
    virtual void OnTestPartResult(const TestPartResult& result) override {
        if (this->showSuccesses && result.passed()) {
            this->eventListener->OnTestPartResult(result);
        }

        if (this->showFailures && result.failed()) {
            this->eventListener->OnTestPartResult(result);
        }
    }

    // Fired after the test ends.
    virtual void OnTestEnd(const TestInfo& test_info) override {
        if ((this->showInlineFailures && test_info.result()->Failed())
                || (this->showSuccesses && !test_info.result()->Failed())) {
            this->eventListener->OnTestEnd(test_info);
        }
    }

    // Fired after the test case ends.
    virtual void OnTestCaseEnd(const TestCase& test_case) override {
        if (this->showTestCases) {
            this->eventListener->OnTestCaseEnd(test_case);
        }
    }

    // Fired before environment tear-down for each iteration of tests starts.
    virtual void OnEnvironmentsTearDownStart(const UnitTest& unit_test) override {
        if (this->showEnvironment) {
            this->eventListener->OnEnvironmentsTearDownStart(unit_test);
        }
    }

    // Fired after environment tear-down for each iteration of tests ends.
    virtual void OnEnvironmentsTearDownEnd(const UnitTest& unit_test) override {
        if (this->showEnvironment) {
            this->eventListener->OnEnvironmentsTearDownEnd(unit_test);
        }
    }

    // Fired after each iteration of tests finishes.
    virtual void OnTestIterationEnd(const UnitTest& unit_test, int iteration) override {
        if (this->showIterationsStartEnd) {
            this->eventListener->OnTestIterationEnd(unit_test, iteration);
        }
    }

    // Fired after all test activities have ended.
    virtual void OnTestProgramEnd(const UnitTest& unit_test) override {
        if (this->showProgramStartEnd) {
            this->eventListener->OnTestProgramEnd(unit_test);
        }
    }
};

class ConfigurableEventListener::Builder {
  private:
    TestEventListener* eventListener;
    bool programStartEnd = false;
    bool iterationsStartEnd = false;
    bool testCases = false;
    bool testNames = false;
    bool successes = false;
    bool failures = false;
    bool inlineFailures = false;
    bool environment = false;

  public:
    /**
     * Set custom TestEventListener.
     */
    Builder(TestEventListener* eventListener) {
        this->eventListener = eventListener;
    }

    /**
     * Show test program start/end.
     */
    Builder showProgramStartEnd() {
        this->programStartEnd = true;
        return *this;
    }

    /**
     * Show test iterations start/end.
     */
    Builder showIterationsStartEnd() {
        this->iterationsStartEnd = true;
        return *this;
    }

    /**
     * Show the names of each test case.
     */
    Builder showTestCases() {
        this->testCases = true;
        return *this;
    }

    /**
     * Show the names of each test.
     */
    Builder showTestNames() {
        this->testNames = true;
        return *this;
    }

    /**
     * Show each success.
     */
    Builder showSuccesses() {
        this->successes = true;
        return *this;
    }

    /**
     * Show each failure.
     */
    Builder showFailures() {
        this->failures = true;
        return *this;
    }

    /**
     * Show each failure as it occurs. You will also see it at the bottom after the full suite is run.
     */
    Builder showInlineFailures() {
        this->inlineFailures = true;
        return *this;
    }

    /**
     * Show the setup of the global environment.
     */
    Builder showEnvironment() {
        this->environment = true;
        return *this;
    }

    /**
     * Return a configured instance of ConfigurableEventListener.
     */
    ConfigurableEventListener* build() {
        return new ConfigurableEventListener(this->eventListener, this->programStartEnd, this->iterationsStartEnd,
                                             this->testCases, this->testNames, this->successes, this->failures,
                                             this->inlineFailures, this->environment);
    }
};
