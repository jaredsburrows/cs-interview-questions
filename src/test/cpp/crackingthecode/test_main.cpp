#include "gtest/gtest.h"
#include "test/configurable_event_listener.h"

int main(int argc, char **argv) {

     // Init Gtest
    testing::InitGoogleTest(&argc, argv);

    // Remove the test default listener
    testing::TestEventListeners &listeners = testing::UnitTest::GetInstance()->listeners();
    auto default_printer = listeners.Release(listeners.default_result_printer());

    // Configure new listener
    ConfigurableEventListener *listener = ConfigurableEventListener::Builder(default_printer).build();
    listeners.Append(listener);

    // Run
    return RUN_ALL_TESTS();
}
