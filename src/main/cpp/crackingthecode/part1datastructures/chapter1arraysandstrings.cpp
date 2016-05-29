#include <cstdbool>
#include <cstring>

#include "chapter1arraysandstrings.h"

const bool isUniqueCharacters(const char* input) {
    if (!input || *input == '\0') {
        return false;
    }

    int check = 0;
    for (; *input != '\0'; input++) {

        const int value = 1 << (*input - 'a');
        const bool hasValue = (check & value) > 0;
        if (hasValue) {
            return false;
        }

        check = check | value;
    }

    return true;
}
