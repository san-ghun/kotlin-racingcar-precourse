# kotlin-racingcar-precourse

> [!NOTE]
> - Break down large functions that handle multiple responsibilities into smaller functions that each do one thing well.
>   - List out the features before implementation and commit your work in small, feature-focused increments.
>   - **If something is not explicitly stated in the functional requirements, use your own judgment to implement it.**
> - **Before implementing any features, list the features you plan to implement in `README.md`.**

---

## List of Features

1. Take input for car names
    - [x] The user enters car names separated by commas (,).
    - [x] Each name must be at least 1 character and no more than 5 characters.
2. Take input for number of rounds
    - [x] The user enters the number of rounds.
    - [x] Must be a number greater than or equal to 1.
3. Implement logic for car to move forward
    - [x] The car decides whether to move forward based on a random value (0 to 9).
    - [x] If it is 4 or more, it moves forward.
4. Output results in each round
    - [ ] For each round, output the names of all cars and their movement results.
    - [ ] The movement results are expressed as `-` symbols.
5. Determine and output the winner(s)
    - [ ] The car(s) that moved the most are determined as the winner.
    - [ ] If there are multiple winners, output them separated by commas.
6. Handle exceptions
    - [ ] If the car name is blank or more than 6 characters.
    - [ ] If the number of rounds is not a number.

---

## (temp) Approach

- Build program with MVC pattern
    - Model
        - Car
        - Round
        - Winner
        - ...
    - View
        - InputView
        - ResultView
        - WinnerView
        - ...
    - Controller
        - GameMaster
        - RoundManager
        - ...
    - Utility
        - RandomMoveGenerator
        - ...

---

## (temp) Checklist

1. Environment setup
    - Action
      - [x] Kotlin 1.9.24
      - [x] Fork & Clone repository
      - [x] Draft feature list on `README.md` file.
      - [x] Write `main()` function in `Application.kt` file.
    - Checkpoint
      - [x] Check whether `./gradlew clean test` run or not. -> `BUILD FAILED`
        - [x] Is `gradlew` executable?
      - [ ] Check whether the environment can build and run Kotlin project or not.
        - [x] The environment is runnable.
        - [ ] The environment is buildable.
2. Writing feature list
    - Action
      - [ ] Refine the list. (add/remove)
    - Checkpoint
      - [ ] Check to git-commit once list been edited.
3. Git convention
    - Action
      - [ ] Git-commit by feature level.
    - Checkpoint
      - [ ] Check commit messages are separated by feature.
      - [ ] Check commit messages start with <types>.
          - <types>: feat:, refactor:, fix:, test:, docs:, chore:, style:
4. Feature implementation
    - Action
      - [ ] Checkout [Feature List](#List-of-Features).
    - Checkpoint
      - [ ] Use `Console` and `Randoms` APIs.
      - [ ] Check cases of exception once again.
5. Writing test code
    - Action
      - [ ] Write test code about core logic based on JUnit5 & AssertJ.
      - [ ] Test features in [Feature List](#List-of-Features).
    - Checkpoint
      - [ ] Check the test gain. No pass no gain.
      - [ ] Make sure `BUILD SUCCESSFUL` from `./gradlew clean test`.
6. Code refactoring
    - Action
      - [ ] Split functions to single tasks.
      - [ ] Refactor to avoid exceeding 2 levels of indentation.
    - Checkpoint
      - [ ] NO `if` inside `while` inside `if` or whatever.
      - [ ] Did you avoid nesting, and extracted proper function?
      - [ ] Did you follow Kotlin Coding Conventions?
7. Before final submission
    - Checkpoint
      - [ ] Does the output format match the requirements?
      - [ ] Does the program terminate when an exception occurs?
      - [ ] Does the program pass all tests?
      - [ ] Does the feature list and commit logs link well?
8. Submission (expect to do)
    - Checkpoint
      - [ ] Complete code push on `origin`.
      - [ ] Complete Pull Request on `upstream`.
      - [ ] Complete submission on mission page.
      - [ ] Write review on submission form.
