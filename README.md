# Assignment One - OOP Systems Implementation

**Student ID:** 27267  
**Student Name:** GISAGARA GANZA Brian

## Project Structure

This project contains 6 different management systems, each demonstrating object-oriented programming principles including inheritance, encapsulation, and data validation.

### Package Structure
- Package: `27267`
- Sub-packages: `q1`, `q2`, `q3`, `q4`, `q5`, `q6`

## Systems Implemented

### Q1: Stock Management System
**Package:** `27267.q1`

**Class Hierarchy:**
Entity → Warehouse → Category → Supplier → Product → StockItem → Purchase → Sale → Inventory → StockReport

**Main Class:** `StockManagementMain`

**Features:**
- 10 classes with inheritance chain
- Private fields with getters/setters
- Constructor-based validation
- Scanner for user input
- Final class `StockReport` with `generateReport()` method

### Q2: Flight Booking System
**Package:** `27267.q2`

**Class Hierarchy:**
Entity → Airport → Airline → Flight → Pilot → CabinCrew → Passenger → Booking → Payment → Ticket

**Main Class:** `FlightBookingMain`

**Features:**
- 10 classes with inheritance chain
- Encapsulation and validation
- Final class `Ticket` with `calculateFare()` method

### Q3: Tax Administration System
**Package:** `27267.q3`

**Class Hierarchy:**
Entity → TaxAuthority → TaxCategory → Taxpayer → Employer → Employee → TaxDeclaration → TaxAssessment → Payment → TaxRecord

**Main Class:** `TaxAdminMain`

**Features:**
- 10 classes with inheritance chain
- Custom exception: `TaxDataException`
- Final class `TaxRecord` with `computeTax()` method

### Q4: Procurement Management System
**Package:** `27267.q4`

**Class Hierarchy:**
Entity → Organization → Department → Supplier → Product → PurchaseOrder → Delivery → Inspection → Invoice → ProcurementReport

**Main Class:** `ProcurementMain`

**Features:**
- 10 classes with inheritance chain
- Final class `ProcurementReport` with `calculateTotal()` method

### Q5: Attendance Management System
**Package:** `27267.q5`

**Class Hierarchy:**
Entity → Institution → Department → Course → Instructor → Student → ClassSession → AttendanceRecord → LeaveRequest → AttendanceSummary

**Main Class:** `AttendanceMain`

**Features:**
- 10 classes with inheritance chain
- Final class `AttendanceSummary` with `generateSummary()` method

### Q6: Payroll Management System (RSSB)
**Package:** `27267.q6`

**Class Hierarchy:**
Entity → Organization → Department → Employee → PayrollPeriod → SalaryStructure → Deduction → Allowance → Payroll → Payslip

**Main Class:** `PayrollMain`

**Features:**
- 10 classes with inheritance chain
- RSSB contribution calculation (5% of basic pay)
- Final class `Payslip` with `generatePayslip()` method

## How to Compile and Run

### Compile all systems:
```bash
javac -d . src/27267/q1/*.java
javac -d . src/27267/q2/*.java
javac -d . src/27267/q3/*.java
javac -d . src/27267/q4/*.java
javac -d . src/27267/q5/*.java
javac -d . src/27267/q6/*.java
```

### Run individual systems:
```bash
# Q1: Stock Management
java q1.StockManagementMain

# Q2: Flight Booking
java q2.FlightBookingMain

# Q3: Tax Administration
java q3.TaxAdminMain

# Q4: Procurement Management
java q4.ProcurementMain

# Q5: Attendance Management
java q5.AttendanceMain

# Q6: Payroll Management
java q6.PayrollMain
```

## Key Features

1. **Inheritance:** Each system demonstrates a 10-class inheritance hierarchy
2. **Encapsulation:** All attributes are private with public getters and setters
3. **Validation:** Constructors validate all input data according to specified rules
4. **User Input:** Scanner class used for interactive data entry
5. **Final Classes:** Each system has a final class with a specific calculation method
6. **Output Formatting:** All output includes student ID [27267] as required

## Validation Rules

Each system implements comprehensive validation:
- ID validation (must be > 0)
- Email format validation
- Phone number validation (10 digits)
- TIN validation (9 digits)
- Date validation (not null)
- Numeric validation (positive values, ranges, etc.)
- String validation (not empty, length requirements, format requirements)

## Notes

- All output is prefixed with student ID [27267]
- All inserted data is displayed before generating reports
- Error messages include student ID for identification
- Each system can be run independently

## Git Repository

This project is version controlled using Git. The repository should be pushed to GitHub with username matching student ID (27267).

