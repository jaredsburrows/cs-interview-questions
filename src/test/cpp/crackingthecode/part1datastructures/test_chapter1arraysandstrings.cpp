#include "gtest/gtest.h"

#include "crackingthecode/part1datastructures/chapter1arraysandstrings.h"

TEST(chapter1arraysandstrings, test_isUniqueCharacters) {
    ASSERT_TRUE(!isUniqueCharacters(nullptr));
    ASSERT_TRUE(!isUniqueCharacters(""));
    ASSERT_TRUE(!isUniqueCharacters("aab"));
    ASSERT_TRUE(!isUniqueCharacters("qwertyuiopplkjhgfdsazxcvbnm"));
    ASSERT_TRUE(isUniqueCharacters("abc"));
    ASSERT_TRUE(isUniqueCharacters("qazwsxedcrfvtgbyhnujmikolp"));
}
