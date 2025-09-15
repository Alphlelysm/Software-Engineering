# CampusLearn – SEN371 Project 1 (Class / UML Definition)

This repository provides:
1. **Agile methodology selection**: Scrum with a light Kanban board for triage.
2. **Business classes/components** mapped from CampusLearn case study.
3. **UML class diagrams** (Mermaid + PlantUML): see `/diagrams`.
4. **Physical class representation** in Java (skeleton only).

> This codebase implements only *skeleton* classes with attributes, basic constructors, and simple method stubs to demonstrate **encapsulation**, **inheritance**, and **composition**. No frameworks are used.

## How to open
- **IntelliJ / VS Code / Eclipse**: Open as a Maven project (Java 17).
- Build: `mvn -q -DskipTests package`

## Diagrams
- Mermaid: `diagrams/mermaid/classes.mmd` (render at https://mermaid.live/)
- PlantUML: `diagrams/plantuml/classes.puml` (render at https://plantuml.com/ or a local plugin)

## Notes
- Names and relationships match the provided case study (Student registration & profiles; topic & tutor management; module-based constraints; uploads of videos/PDFs/interactive; quizzes; messaging; notifications).
- Replace or extend attributes/methods to match your **Assignment 1** specs precisely.
- Keep your **Definition of Done**: class compiles, UML updated, and README maintained.