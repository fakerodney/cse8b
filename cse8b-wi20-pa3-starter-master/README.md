
Bug 1: line 32
when getting the length of an array. We need to use array.length instead of .length(). That's for getting a length of the string.


Bug 2: line 51
logic error
the array could be null or the length of the array is zero. So instead of && we should use ||

Bug 3: line 81

after the if statement should be a justification. We want to make sure array is not null so it should be (array == null) instead of (array = null)

Bug 4: line 124

there is no variable called j. Here we want to assign the rear part of original array to be the first half part of it. Instead of using a non-sense variable j we should use (array.length - i - 1) so that we can get the last 1/2/... of the original array.

Bug 5: line 97

array out of bound: We cannot get array[array.length] because that will get a non-exist position. Instead of 'i <= array.length' it should be 'i < array.length'

Bug 6: line 81

When copying an array, we want to assign the result to be the original one. So instead of array[i]result = [i]; it should be result[i] = array[i];.

Bug 7: line 40

When finding the range we want to find the difference between maximum and minimum. That should be max-min instead of max+min

Bug 8: line 62

When calculating the average we want to use (sum/index). That is true but the average might, or actually in most of the times, should be a double instead of an integer. Sum and index are both integer so the outcome is also an integer. We need to use Double.value of() method to convert the integer into a double and then do the calculation.


Bug 9: line 140

First of all. J and temp cannot be assigned as final. Because they need to be updated throughout the process, and the second line is j++ instead of i++. Also we want to sort the larger one to the right so we should set the j+1 to be temp and then swap j+1 and j.