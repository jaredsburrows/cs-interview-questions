#include <gtest/gtest.h>

extern "C" {
#include "crackingthecode/part1datastructures/chapter1arraysandstrings.h"
}

TEST(chapter1arraysandstrings, test_isUniqueCharacters) {
    EXPECT_FALSE(isUniqueCharacters(NULL));
    EXPECT_FALSE(isUniqueCharacters(""));
    EXPECT_FALSE(isUniqueCharacters("aab"));
    EXPECT_FALSE(isUniqueCharacters("qwertyuiopplkjhgfdsazxcvbnm"));
    EXPECT_TRUE(isUniqueCharacters("abc"));
    EXPECT_TRUE(isUniqueCharacters("qazwsxedcrfvtgbyhnujmikolp"));
}
