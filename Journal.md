# Journal
Phase 1
Checking reference equality between variables confirm that you have a Singleton, because those variables will 
always be the same.The private constructor restricts the creation of a new instance by any external class using 
the new keyword. The static access method getInstance() is the only entry point to the single instance for the
application.

Phase 2
Lazy loading is useful if you need the program to load faster initially, and use less memory and resources.
It is good for objects or data that are not used very often. The trade-off is that it will not load everything 
into memory at once and keep all data stored in memory. You can only access that data on demand as you make calls
to the instance.