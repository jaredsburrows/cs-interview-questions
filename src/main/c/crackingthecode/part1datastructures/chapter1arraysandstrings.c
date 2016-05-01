#include <stdbool.h>
#include <string.h>
#include <stdio.h>

#include "chapter1arraysandstrings.h"

const bool isUniqueCharacters(const char* input) {
    if (!input || *input == '\0') {
        return false;
    }

    int check = 0;
    for (; *input != NULL; input++) {

        const int value = 1 << (*input - 'a');
        const bool hasValue = (check & value) > 0;
        if (hasValue) {
            return false;
        }

        check = check | value;
    }

    return true;
}
