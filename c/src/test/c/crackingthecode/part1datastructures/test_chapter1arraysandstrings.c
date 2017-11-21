#include <CUnit/Basic.h>

#include "crackingthecode/part1datastructures/chapter1arraysandstrings.h"
#include "crackingthecode/part1datastructures/test_chapter1arraysandstrings.h"

void test_isUniqueCharacters() {
    CU_ASSERT(!isUniqueCharacters(NULL));
    CU_ASSERT(!isUniqueCharacters(""));
    CU_ASSERT(!isUniqueCharacters("aab"));
    CU_ASSERT(!isUniqueCharacters("qwertyuiopplkjhgfdsazxcvbnm"));
    CU_ASSERT(isUniqueCharacters("abc"));
    CU_ASSERT(isUniqueCharacters("qazwsxedcrfvtgbyhnujmikolp"));
}
