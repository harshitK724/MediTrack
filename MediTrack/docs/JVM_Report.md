# JVM Internal Report - MediTrack

### 1. Class Loader Subsystem
The Class Loader is responsible for loading the `.class` files into the JVM memory. It follows three main phases:
- **Loading:** Finding and importing binary data for the classes (e.g., `Patient.class`).
- **Linking:** Verifying bytecode, preparing static variables, and resolving symbolic references.
- **Initialization:** Executing static blocks and assigning values to static variables.

### 2. Runtime Data Areas
- **Method Area:** Stores class-level data, including static variables and code for methods.
- **Heap Area:** This is where all objects are stored (e.g., every `new Patient()` instance). It is shared among all threads.
- **Stack Area:** Stores local variables and partial results for every thread. Each method call creates a new 'frame' on the stack.
- **PC Registers:** Contains the address of the currently executing JVM instruction.

### 3. Execution Engine
- **Interpreter:** Reads bytecode and executes it line-by-line. It is fast to start but slower to execute.
- **JIT (Just-In-Time) Compiler:** Identifies "hot spots" (frequently used code) and compiles them into native machine code for high performance.
- **Garbage Collector (GC):** Automatically identifies and deletes objects that are no longer reachable (e.g., a deleted `Appointment` object).

### 4. "Write Once, Run Anywhere" (WORA)
Java's platform independence comes from bytecode. The Java compiler (`javac`) converts code into an intermediate format (.class) which can run on any device with a compatible Java Virtual Machine (JVM).