---

### 3. `docs/Design_Decisions.md`
This document explains the architectural choices and patterns used in the project  [cite: 43, 80-84].

```markdown
# Design Decisions & Architectural Patterns

### 1. Object-Oriented Principles
- **Encapsulation:** All entity fields (ID, Name, Age) are private. Access is provided only through getters and setters with validation.
- **Inheritance:** `Person` acts as a base class for `Doctor` and `Patient` to reduce code duplication.
- **Abstraction:** We used the `MedicalEntity` abstract class and `Payable/Searchable` interfaces to define common behaviors without specifying implementation.

### 2. Design Patterns
- **Singleton Pattern:** Used for the `IdGenerator` to ensure that ID sequences (e.g., PAT1001, DOC1001) remain unique across the entire application.
- **Strategy Pattern (Bonus):** Implemented in the billing module to allow different tax or fee calculation strategies depending on the appointment type.

### 3. Advanced Java Features
- **Generics:** Implemented a generic `DataStore<T>` to handle storage for any entity type, ensuring type safety without code repetition [cite: 29-30].
- **Immutability:** The `BillSummary` class is marked `final` with `final` fields to ensure data integrity once a bill is generated  [cite: 18-19, 75].
- **Cloning:** Deep cloning is implemented for `Patient` and `Appointment` to safely copy data without affecting original objects in memory.