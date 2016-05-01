#include <CUnit/Basic.h>
#include "gradle_cunit_register.h"
#include "test_chapter1arraysandstrings.h"

int suite_init() {
    return 0;
}

int suite_clean() {
    return 0;
}

void gradle_cunit_register() {
    CU_pSuite suite = CU_add_suite("crackingthecode tests", suite_init, suite_clean);
    CU_add_test(suite, "test_isUniqueCharacters", test_isUniqueCharacters);
}
