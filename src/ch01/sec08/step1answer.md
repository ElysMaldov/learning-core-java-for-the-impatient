There are many differences:
* Element access: `a[i]` vs. `al.get(i)`/`al.set(i, e)`
* Type name: `ElementType[]` vs. `ArrayList<ElementType>`
* `a.length` vs. `al.size()`
* The length of an array is fixed; the size of an array list can vary
* `ArrayList` has `add` and `remove` methods
* `Collections` has useful methods for working with array lists
* Construction: `new ElementType[length]` vs `new ArrayList<ElementType>()` (which has size 0)
* Construction with initial values: `new ElementType[] { e1, e2, e3}` vs. `new ArrayList<>(List.of(e1, e2, e3))`
* Copying: `Arrays.copyOf(a, length)` vs `new ArrayList<>(al)`
* String representation: `Arrays.toString(a)` vs. `al.toString()`
