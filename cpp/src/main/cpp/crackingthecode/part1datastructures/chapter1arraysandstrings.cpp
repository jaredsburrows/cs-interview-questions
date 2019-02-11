#include <cstdbool>
#include <cstring>

#include "crackingthecode/part1datastructures/chapter1arraysandstrings.h"

bool isUniqueCharacters(char* input) {
    if (!input || *input == '\0') {
        return false;
    }

    int check = 0;
    for (; *input != '\0'; input++) {

        int value = 1 << (*input - 'a');
        bool hasValue = (check & value) > 0;
        if (hasValue) {
            return false;
        }

        check = check | value;
    }

    return true;
}
