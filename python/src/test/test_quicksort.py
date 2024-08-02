from unittest import TestCase

from quicksort import quicksort


class Test(TestCase):
    def test_quicksort(self):
        quicksort([3, 6, 8, 10, 1, 2, 1])
