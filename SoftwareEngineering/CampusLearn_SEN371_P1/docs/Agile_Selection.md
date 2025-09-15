# Agile Methodology – Evaluation & Selection

**Selected:** Scrum (with a light Kanban triage board)

## Why Scrum fits CampusLearn
- **Incremental value**: We can deliver vertical slices (Registration → Topics & Alerts → Uploads → Quizzes/Messaging).
- **Clear roles & cadence**: PO manages backlog/acceptance, SM safeguards ceremonies, devs deliver in 2-week sprints.
- **Risk visibility**: Frequent reviews surface access control rules early (e.g., only registered tutors for a module may respond to a topic).
- **Traceability to design**: Each story maps to updated UML + class skeletons (Definition of Done).

## Alternatives considered
- **Kanban**: Great for continuous flow and support work, but weaker timebox and academic deliverable planning.
- **XP**: Superb engineering discipline; heavier practice overhead for a short student project.
- **Scrumban**: Useful hybrid if many interrupts occur; optional evolution after Sprint 1.

## Initial Backlog (sample)
- **User & Security**: Register student; update profile; authenticate; role checks.
- **Topics & Tutors**: Student creates topic; subscribe/unsubscribe; notify tutors; enforce module-based tutor response.
- **Learning Materials**: Tutor uploads videos/PDFs/interactive; organize by Topic; mobile-friendly.
- **Messaging & Alerts**: Student↔Tutor messages; notifications for new responses.
- **Quizzes**: Author questions/options, student attempts, scoring.

## Sprint Outline
- **Sprint 1**: Domain model baseline (Users/Student/Tutor/Module/Topic/Subscription), registration/profile stubs, topic creation & subscription, UML v1, Java skeleton v1.
- **Sprint 2**: Tutor access rules by Module; uploads (Video/Document/Interactive); Q&A; notifications; UML v2, skeleton v2.
- **Sprint 3**: Quizzes & Messaging threads; polishing diagrams; README/docs complete.

## Definition of Done (DoD)
- Updated UML; compiling class skeletons; unit test placeholder; README/docs updated; demo notes recorded.