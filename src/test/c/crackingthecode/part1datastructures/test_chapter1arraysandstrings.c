#include <CUnit/Basic.h>

#include "chapter1arraysandstrings.h"

void test_isUniqueCharacters() {
    CU_ASSERT(!isUniqueCharacters('\0'));
    CU_ASSERT(!isUniqueCharacters(NULL));
    CU_ASSERT(!isUniqueCharacters(""));
    CU_ASSERT(isUniqueCharacters("abc"));
    CU_ASSERT(!isUniqueCharacters("aab"));
    CU_ASSERT(isUniqueCharacters("qazwsxedcrfvtgbyhnujmikolp"));
    CU_ASSERT(!isUniqueCharacters("qwertyuiopplkjhgfdsazxcvbnm"));
}
