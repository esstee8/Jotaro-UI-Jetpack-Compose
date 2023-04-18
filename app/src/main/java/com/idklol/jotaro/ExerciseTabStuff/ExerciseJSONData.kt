package com.idklol.jotaro.ExerciseTabStuff

// A data class
// The default value is the raw json data. So, just load a r&om string, & then access the `json_data`
//      default value to get the JSON data.
data class ExerciseJSONData(val unimportantString: String) {
    var json_data = """
[
    {
        "id": "0001",
        "name": "static-neck-flexion-extension",
        "title": "Static Neck Flexion & Extension",
        "primer": "An exercise to either build or warm-up front & back neck strength",
        "type": "Isometric",
        "primary": [
            "Trapezius"
        ],
        "secondary": [],
        "equipment": [
            "Body"
        ],
        "steps": [
            "An exercise to either build or warm-up front & back neck muscles",
            "St& or sit with your head in neutral position",
            "Place both of your h&s on your forehead",
            "Press your head against your h&s & contract your neck muscles",
            "Keep your head from moving forward. Hold for at least 30 seconds",
            "Repeat with h&s on the back of your head, pressing against them"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0001-relaxation.svg",
            "svg/0001-tension.svg"
        ],
        "png": [
            "png/0001-relaxation.png",
            "png/0001-tension.png"
        ]
    },
    {
        "id": "0002",
        "name": "static-neck-side-flexion",
        "title": "Static Neck Side Flexion",
        "primer": "An exercise either build or warm up neck side flexors",
        "type": "Isometric",
        "primary": [
            "Trapezius"
        ],
        "secondary": [],
        "equipment": [
            "Body"
        ],
        "steps": [
            "St& or sit with your head in neutral position",
            "Place your left h& against the left side of your head, above your ear",
            "Push your head against your h&, without moving your head",
            "Repeat with your right h&, right side of your head"
        ],
        "tips": [
            "Make sure you maintain your chin at a 90 degree angle to your neck"
        ],
        "references": [],
        "svg": [
            "svg/0002-relaxation.svg",
            "svg/0002-tension.svg"
        ],
        "png": [
            "png/0002-relaxation.png",
            "png/0002-tension.png"
        ]
    },
    {
        "id": "0003",
        "name": "seated-shoulder-press-machine",
        "title": "Seated Shoulder Press Machine",
        "primer": "An exercise for the shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "Triceps Brachii"
        ],
        "equipment": [
            "machine"
        ],
        "steps": [
            "Sit upright with your back supported by the chair & draw your abs in",
            "Place your h&s on the bars & with smooth even motions press upward extending your arms, but not locking them",
            "At the top pause then with controlled motion lower the bars to your starting position"
        ],
        "tips": [
            "Ensure that the seat & bar have been adjusted for optimal posture"
        ],
        "references": [],
        "svg": [],
        "png": []
    },
    {
        "id": "0004",
        "name": "seated-military-press",
        "title": "Seated Military Press",
        "primer": "An exercise for the shoulder & triceps strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "Triceps Brachii"
        ],
        "equipment": [
            "Barbell",
            "Bench"
        ],
        "steps": [
            "Sit on the bench with your toes pointing straight out, back straight & abs drawn in",
            "Grip the bar with your palms facing outwards & your h&s shoulder width apart",
            "With bar in front of your head, press upwards extending your arms but not locking them",
            "Pause at the top & then in a controlled movement lower the bar to the starting position"
        ],
        "tips": [
            "Ensure your hips, knees & ankles are at 90 degree positions to ensure optimal posture",
            "This exercise can also be performed with the bar in the starting position behind your head"
        ],
        "references": [],
        "svg": [
            "svg/0004-relaxation.svg",
            "svg/0004-tension.svg"
        ],
        "png": [
            "png/0004-relaxation.png",
            "png/0004-tension.png"
        ]
    },
    {
        "id": "0005",
        "name": "shoulder-shrugs",
        "title": "Shoulder Shrugs: Dumbbell",
        "primer": "An exercise for Trapezius strengthening",
        "type": "Isolation",
        "primary": [
            "Trapezius"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "St& with your feet shoulder width apart & a slight bend in your knees",
            "Hold a dumbbell in each h& & with your arms at your sides",
            "Lower your shoulders as much as possible",
            "With your arms straight raise both shoulders up towards your ears",
            "Hold the upright positions for a moment & then lower in a controlled motion"
        ],
        "tips": [
            "Do not do this exercise if you are experiencing any shoulder or neck pain"
        ],
        "references": [],
        "svg": [
            "svg/0005-relaxation.svg",
            "svg/0005-tension.svg"
        ],
        "png": [
            "png/0005-relaxation.png",
            "png/0005-tension.png"
        ]
    },
    {
        "id": "0006",
        "name": "arnold-press",
        "title": "Arnold Press",
        "primer": "An exercise for shoulder & triceps strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "Triceps Brachii"
        ],
        "equipment": [
            "Dumbbells"
        ],
        "steps": [
            "Sit on a flat bench, feet point forward with your abs drawn in",
            "Grasp a dumbbell in each h& with your palm facing towards your body",
            "Bend your elbows to 90 degrees & raise both your arms to the starting point in line with your shoulders",
            "With a steady controlled motion raise your arms up while straightening your elbows while rotating your forearms so that your palms now face away from your body",
            "Bring the dumbbells closer together but do not fully extend your elbows",
            "With a controlled motion lower the dumbbells to the starting position at your shoulders"
        ],
        "tips": [
            "Start with a lower dumbbell weight in order to perfect the technique",
            "Do not perform this exercise if you have shoulder pain"
        ],
        "references": [],
        "svg": [],
        "png": []
    },
    {
        "id": "0007",
        "name": "front-barbell-raises",
        "title": "Front Barbell Raises",
        "primer": "An exercise for shoulder, chest & forearm strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "Pectoralis Major",
            "forarm"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Grasp a barbell with an overh& grip(palms of h&s face downwards) ",
            "St& up-right with your feet shoulder width apart, knees slightly bent & your abs drawn in",
            "With your arms straight, raise the barbell in a controlled motion to shoulder level",
            "Hold for a moment & then lower the barbell in at the same motion"
        ],
        "tips": [
            "Maintain a good upright posture when performing this exercise, do not sway or arch your back",
            "Do not perform this exercise if you have shoulder pain"
        ],
        "references": [],
        "svg": [],
        "png": []
    },
    {
        "id": "0008",
        "name": "front-cable-raises",
        "title": "Front Cable Raises",
        "primer": "An exercise for shoulders, chest & forearm strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "Pectoralis Major",
            "forearm"
        ],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Place the pulley on the setting just above the floor",
            "St& with your feet shoulder width apart, your abs drawn in & your knees slightly bent",
            "Starting at waist height, take the pulley in your left h&, palm facing the floor with otherwise known as an overh& grip, & raise your straight arm up towards your left shoulder",
            "At shoulder height pause for a moment",
            "With a controlled movement resist the weight & slowly lower your arm back to starting position at your waist",
            "Repeat the exercise with your right arm"
        ],
        "tips": [
            "Maintain a good posture at all times during this exercise ensuring not swaying or arching at your back",
            "Do not perform this exercise if you have shoulder pain"
        ],
        "references": [],
        "svg": [
            "svg/0008-relaxation.svg",
            "svg/0008-tension.svg"
        ],
        "png": [
            "png/0008-relaxation.png",
            "png/0008-tension.png"
        ]
    },
    {
        "id": "0009",
        "name": "cable-shoulder-shrugs",
        "title": "Shoulder Shrugs: Cable",
        "primer": "An exercise for Trapezius strengthening",
        "type": "Isolation",
        "primary": [
            "Trapezius"
        ],
        "secondary": [
            "Deltoid"
        ],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Attach a pulley to the lowest setting on cable machine",
            "St& with your feet shoulder width apart, your abs drawn & your back straight",
            "Start with the pulley at waist height",
            "Grasp the pulley & shrug your shoulders up while keeping your arms extended",
            "Hold this position for a moment then with a controlled motion return to the starting position of the pulley to waist height"
        ],
        "tips": [
            "Bend your knees slightly when st&ing"
        ],
        "references": [],
        "svg": [
            "svg/0009-relaxation.svg",
            "svg/0009-tension.svg"
        ],
        "png": [
            "png/0009-relaxation.png",
            "png/0009-tension.png"
        ]
    },
    {
        "id": "0010",
        "name": "front-raises",
        "title": "Front Raises",
        "primer": "An exercise for shoulder, chest & forearm strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "forearm",
            "Pectoralis Major"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "St& with your feet shoulder width apart, abs drawn in & knees slightly bent",
            "Grasp a dumbbell in each h&, with your palm facing down",
            "Start with the dumbbell at waist height",
            "Raise your left arm, keeping your elbow slightly bent & your arm straight, to in line with your shoulder",
            "Pause for a moment & with a controlled motion lower your arm to back to the starting position at your waist",
            "Repeat with your right arm"
        ],
        "tips": [
            "Do not perform this exercise if you have any shoulder, elbow or wrist pain"
        ],
        "references": [],
        "svg": [],
        "png": []
    },
    {
        "id": "0011",
        "name": "barbell-shoulder-press",
        "title": "Seated Barbell Shoulder Press",
        "primer": "An exercise for shoulder, chest & triceps strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "Triceps Brachii",
            "Pectoralis Major"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Sitting on a bench with a barbell rack, grasp the barbell with a grip 3 to 4 inches wider than your shoulders",
            "Lift the bar off the rack & lower it to just at the height of your shoulders",
            "While maintaining  good posture, straighten your arms & raise the bar up above your head",
            "Pause for a moment & then in a controlled movement lower the bar to the starting position"
        ],
        "tips": [
            "Do not perform this exercise if you have shoulder, elbow or wrist pain"
        ],
        "references": [],
        "svg": [],
        "png": []
    },
    {
        "id": "0012",
        "name": "dumbbell-shoulder-press",
        "title": "Dumbbell Shoulder Press",
        "primer": "An exercise for shoulder, chest & triceps strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "Triceps Brachii",
            "Pectoralis Major"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Sitting on a bench, with your abs drawn in grasp a dumbbell in each h&, with your palms facing forward",
            "Begin with your arms at the height of your shoulders",
            "Extend your arms & raise the dumbbells up above your head",
            "At the top of the movement, bring your arms closer together",
            "Pause for a moment & then in a controlled movement lower the dumbbells to the starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [],
        "png": []
    },
    {
        "id": "0013",
        "name": "smith-machine-upright-row",
        "title": "Upright Row: Smith Machine",
        "primer": "An exercise for shoulder & biceps strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "biceps brachii",
            "upper back"
        ],
        "equipment": [
            "Smith Machine"
        ],
        "steps": [
            "St& with your feet shoulder width apart & your abs drawn in",
            "Place the bar on the Smith Machine in the position where your arms are fully extended in front of you",
            "Place your h&s shoulder width apart & raise the bar up towards your chin with a controlled motion",
            "Pause at the top for a moment & rotate your shoulder blades together",
            "Lower the bar to the starting position"
        ],
        "tips": [
            "Ensure you do not arch your back when pulling the bar up towards your chin"
        ],
        "references": [],
        "svg": [
            "svg/0013-relaxation.svg",
            "svg/0013-tension.svg"
        ],
        "png": [
            "png/0013-relaxation.png",
            "png/0013-tension.png"
        ]
    },
    {
        "id": "0014",
        "name": "upright-barbell-rows",
        "title": "Upright Barbell Rows",
        "primer": "An exercise for shoulder, biceps & upper back strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "biceps brachii",
            "upper back"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "St& with your feet shoulder width apart, your abs drawn in & back straight",
            "Place the bar on rack in the position where your arms are fully extended in front of you with your elbows slightly bent",
            "Place your h&s shoulder width apart & raise the bar up towards your chin with a controlled motion",
            "Pause at the top for a moment & rotate your shoulder blades together",
            "Lower the bar to the starting position",
            "Repeat"
        ],
        "tips": [
            "Do not arch your back when raising the barbell towards your chin"
        ],
        "references": [],
        "svg": [
            "svg/0014-relaxation.svg",
            "svg/0014-tension.svg"
        ],
        "png": [
            "png/0014-relaxation.png",
            "png/0014-tension.png"
        ]
    },
    {
        "id": "0015",
        "name": "upright-cable-row",
        "title": "Upright Cable Row",
        "primer": "An exercise for shoulder, biceps & upper back strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "upper back",
            "biceps brachii"
        ],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Attach a straight bar to the pulley on the floor",
            "St& with your feet shoulder width apart, your abs drawn in & your back straight",
            "Grasp the bar with an overh& grasp (your palms facing downwards) & pull it up towards your waist, this is the starting position",
            "Raise the bar up to in line with your shoulders",
            "Pause at the top & rotate your shoulder blades together",
            "Lower the bar in a controlled motion to the starting position"
        ],
        "tips": [
            "Do not arch your back when raising the bar to your shoulders"
        ],
        "references": [],
        "svg": [
            "svg/0015-relaxation.svg",
            "svg/0015-tension.svg"
        ],
        "png": [
            "png/0015-relaxation.png",
            "png/0015-tension.png"
        ]
    },
    {
        "id": "0016",
        "name": "dumbbell-upright-rows",
        "title": "Upright Row: Dumbbell",
        "primer": "An exercise for shoulder, biceps & upper back strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "biceps brachii",
            "upper back"
        ],
        "equipment": [
            "Dumbbells"
        ],
        "steps": [
            "Grasp a dumbbell in each h& with an overh& grip (palms facing downwards) & hold them in front of your thighs",
            "St& with your feet shoulder width apart, your abs drawn in & your back straight",
            "Starting with the dumbbells at your thighs, slowly raise them up towards your shoulders by bending your elbows",
            "Pause at the top & rotate your shoulder blades together",
            "Lower the dumbbells in a controlled motion to your thighs",
            "Repeat"
        ],
        "tips": [
            "Do not arch your back when raising the dumbbells towards your shoulders",
            "Ensure the dumbbells are held close to your body throughout the exercise",
            "Do not perform this exercise if you have wrist, shoulder or elbow pain"
        ],
        "references": [],
        "svg": [
            "svg/0016-relaxation.svg",
            "svg/0016-tension.svg"
        ],
        "png": [
            "png/0016-relaxation.png",
            "png/0016-tension.png"
        ]
    },
    {
        "id": "0017",
        "name": "bent-over-lateral-cable-raises",
        "title": "Bent-over Lateral Cable Raises",
        "primer": "An exercise for shoulder, Trapezius & middle back strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "Trapezius",
            "Latissimus Dorsi"
        ],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Grasp the h&le of the low pulley with your right h&",
            "Bend forward from the waist; your upper body should be nearly parallel with the floor. Bend your knees slightly & place your left h& on your left thigh. Let your right arm hang from your shoulder in front of you with your elbow slightly bent. This is your starting position",
            "Lift your right arm, keeping your elbow slightly bent",
            "Keep moving your arm until it is parallel to the floor, in line with your right ear",
            "Slowly bring the weight back down to the starting position",
            "Perform exercise on left arm & then repeat"
        ],
        "tips": [
            "Start with a lower weight in order to perfect the technique",
            "Ensure your back remains straight throughout this exercise in order to prevent injury"
        ],
        "references": [],
        "svg": [
            "svg/0017-relaxation.svg",
            "svg/0017-tension.svg"
        ],
        "png": [
            "png/0017-relaxation.png",
            "png/0017-tension.png"
        ]
    },
    {
        "id": "0018",
        "name": "lateral-dumbbell-raises",
        "title": "Lateral Dumbbell Raises",
        "primer": "An exercise for lateral deltoid, shoulder & forearm strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Dumbbells"
        ],
        "steps": [
            "Grasp a dumbbell in each h&, palms facing inward towards your body & the dumbbells at your sides",
            "St&ing with your feet shoulder with apart, draw your abs in & bend your knees slightly",
            "While keeping your torso still, raise the your arms up to the sides keeping your arms straight with a slight bend in the elbows",
            "Raise your arms up until in line with your shoulders, your palms should face the floor",
            "Hold the position for a moment then in a controlled movement lower your arms to the starting position",
            "Repeat"
        ],
        "tips": [
            "Maintain a good upright posture ensuring no arching in the back in order to prevent injuries"
        ],
        "references": [],
        "svg": [
            "svg/0018-relaxation.svg",
            "svg/0018-tension.svg"
        ],
        "png": [
            "png/0018-relaxation.png",
            "png/0018-tension.png"
        ]
    },
    {
        "id": "0019",
        "name": "ball-wall-circles",
        "title": "Ball Wall Circles",
        "primer": "An exercise to strengthen & stretch the rotator cuff muscles or shoulder muscles",
        "type": "Compound",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "biceps brachii",
            "Triceps Brachii"
        ],
        "equipment": [
            "swiss ball"
        ],
        "steps": [
            "St& upright with your feet shoulder width apart",
            "Place a Swiss ball at chest height against a wall & with your left h&, roll the ball in small circles against the wall",
            "Keep your arm fully extended with a slight bend in the elbow",
            "Reverse the direction of the circles",
            "Switch arms"
        ],
        "tips": [
            "Maintain a good upright posture throughout this exercise",
            "Ensure the swiss ball is inflated enough to allow for smooth rhythmical circles"
        ],
        "references": [],
        "svg": [
            "svg/0019-relaxation.svg",
            "svg/0019-tension.svg"
        ],
        "png": [
            "png/0019-relaxation.png",
            "png/0019-tension.png"
        ]
    },
    {
        "id": "0020",
        "name": "back-flys-exercise-band",
        "title": "Back Fly's with Exercise Band",
        "primer": "An exercise for shoulder, middle back & triceps strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "Triceps Brachii",
            "Latissimus Dorsi"
        ],
        "equipment": [
            "exercise band"
        ],
        "steps": [
            "Place an exercise band around a post or machine at mid chest height",
            "St& with your feet shoulder width apart, abs drawn in & knees slightly bent",
            "St& back from the post so there is tension in the band, grasping the band with your arms extended in front of you & a slight bend in your elbows; this is your starting position",
            "Bring your arms back in a controlled motion till they are parallel at your sides & in line with your shoulders",
            "Slowly return your arms to the starting position in front of your chest",
            "Repeat"
        ],
        "tips": [
            "Maintain a good upright posture at all times during this exercise ensuring you do not arch your back"
        ],
        "references": [],
        "svg": [
            "svg/0020-relaxation.svg",
            "svg/0020-tension.svg"
        ],
        "png": [
            "png/0020-relaxation.png",
            "png/0020-tension.png"
        ]
    },
    {
        "id": "0021",
        "name": "flat-bench-leg-raises",
        "title": "Flat Bench Leg Raises",
        "primer": "An exercise for lower abdominal strengthening",
        "type": "Isolation",
        "primary": [
            "abdominals"
        ],
        "secondary": [],
        "equipment": [
            "Body"
        ],
        "steps": [
            "Lie on a flat bench with your h&s under your hips supporting your back",
            "Your legs should be unsupported by the bench from below your knees",
            "With your feet together & your toes flexed upwards, raise your straight legs up a few cm off the bench; both of your legs should have no contact with the bench. This is your starting position",
            "Keep your legs straight with a slight bend in the knees & raise your legs to just before 90 degrees with your hips",
            "Pause at the top & lower your legs in slow controlled manner back to the starting position",
            "Repeat"
        ],
        "tips": [
            "If you are pregnant you should contact your doctor prior to doing this exercise",
            "Ensure your back stays in contact with the bench at all times during this exercise"
        ],
        "references": [],
        "svg": [
            "svg/0021-relaxation.svg",
            "svg/0021-tension.svg"
        ],
        "png": [
            "png/0021-relaxation.png",
            "png/0021-tension.png"
        ]
    },
    {
        "id": "0022",
        "name": "smith-machine-rear-deltoid-row",
        "title": "Smith Machine Rear Deltoid Row",
        "primer": "A exercise for the rear deltoid",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "back",
            "biceps brachii"
        ],
        "equipment": [
            "Smith Machine"
        ],
        "steps": [
            "An exercise for rear deltoid,shoulder, biceps & back strengthening",
            " Set the bar to the lowest setting",
            "Place your feet shoulder width apart with a slight bend in the knees",
            "Bend at the waist while keeping your back straight & chest parallel to the floor",
            "Grasp the bar slightly wider than your shoulders with an overh& grasp & your arms straight with a slight bend in the elbows",
            "Raise the bar with a controlled motion to the lower part of your chest by bending & elevating your elbows",
            "Hold for a moment & then lower to the starting position",
            "Repeat"
        ],
        "tips": [
            "Ensure you back is straight & that you maintain a good posture throughout this exercise"
        ],
        "references": [],
        "svg": [
            "svg/0022-relaxation.svg",
            "svg/0022-tension.svg"
        ],
        "png": [
            "png/0022-relaxation.png",
            "png/0022-tension.png"
        ]
    },
    {
        "id": "0023",
        "name": "lying-rear-lateral-raise",
        "title": "Lying Rear Lateral Raise",
        "primer": "An exercise for shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [],
        "equipment": [
            "flat bench",
            "Dumbbells"
        ],
        "steps": [
            "Place the dumbbells at he head of the bench",
            "Lie facedown on a raised bench; raised enough for your arms to move freely beneath the bench",
            "Place your toes on the floor in order to stabilise yourself",
            "Grasp the dumbbells & with a 30 degree bend in your elbows, this is the starting position",
            "Raise your arms to shoulder height, maintaining a controlled motion",
            "Return to starting position & repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0023-relaxation.svg",
            "svg/0023-tension.svg"
        ],
        "png": [
            "png/0023-relaxation.png",
            "png/0023-tension.png"
        ]
    },
    {
        "id": "0024",
        "name": "rear-deltoid-row-dumbbell",
        "title": "Rear Deltoid Row Dumbbell",
        "primer": "An exercise for deltoid, biceps & Trapezius strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "biceps brachii",
            "Trapezius"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Place your right foot on the floor, rest your left knee & h& on a flat bench",
            "Lean forward so your body’s weight is supported by your left arm & knee",
            "Keeping your back flat, reach down & pick up the dumbbell with your right h&",
            "Raise your right arm as close to your chest as possible; while bending & bringing your elbow back as far as you can",
            "Pause at the top for a moment & then lower the dumbbell in a controlled manner to the starting position",
            "Switch arms by doing the opposite positioning",
            "Repeat"
        ],
        "tips": [
            "maintain a good posture at all times throughout the exercise"
        ],
        "references": [],
        "svg": [
            "svg/0024-relaxation.svg",
            "svg/0024-tension.svg"
        ],
        "png": [
            "png/0024-relaxation.png",
            "png/0024-tension.png"
        ]
    },
    {
        "id": "0025",
        "name": "seated-cable-rows",
        "title": "Seated Cable Rows",
        "primer": "An exercise for middle back, biceps & lower back strengthening",
        "type": "Compound",
        "primary": [
            "Latissimus Dorsi"
        ],
        "secondary": [
            "biceps brachii",
            "erector spinae"
        ],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Sit at a low pulley machine with your feet resting against the footrests & your knees slightly bent",
            "With your abs drawn in & your back straight lean forward slightly to grasp the pulleys with an overh& grip (palms face downwards)",
            "Slowly bring the pulleys back towards your abs while sitting upright, keep your elbows in close to your chest",
            "Pause for a moment then return slowly return the pulleys to the starting position",
            "Repeat"
        ],
        "tips": [
            "Ensure that your back is straight at all times & do not lock your knees when rowing back"
        ],
        "references": [],
        "svg": [
            "svg/0025-relaxation.svg",
            "svg/0025-tension.svg"
        ],
        "png": [
            "png/0025-relaxation.png",
            "png/0025-tension.png"
        ]
    },
    {
        "id": "0026",
        "name": "reverse-grips-bent-over-barbell-rows",
        "title": "Reverse Grips Bent Over Barbell Rows",
        "primer": "An exercise for middle back & biceps strengthening",
        "type": "Isolation",
        "primary": [
            "Latissimus Dorsi"
        ],
        "secondary": [
            "biceps brachii"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Bend over a barbell at slight angle with your knees bent & your back straight",
            "Grasp the bar with a reverse grip (palms facing up) & slowly pull the barbell to your abs, keeping your elbows close to your sides",
            "Pause for a moment at the top",
            "Return the barbell to the starting position",
            "Repeat"
        ],
        "tips": [
            "Ensure that the weight of the barbell is evenly distributed through both h&s"
        ],
        "references": [],
        "svg": [
            "svg/0026-relaxation.svg",
            "svg/0026-tension.svg"
        ],
        "png": [
            "png/0026-relaxation.png",
            "png/0026-tension.png"
        ]
    },
    {
        "id": "0027",
        "name": "stationary-abdominal-draw-in",
        "title": "Stationary Abdominal Draw In",
        "primer": "An exercise for abdominal & core strengthening which are vital in supporting the spine",
        "type": "Isometric",
        "primary": [
            "abdominals"
        ],
        "secondary": [
            "core"
        ],
        "equipment": [
            "Body"
        ],
        "steps": [
            "Get down on a mat on your h&s & knees, forming a four point rectangle or square shape",
            "Keep your back straight & your hips & pelvis in a neutral position",
            "Draw your abs in, crunching your abs while keeping your back still",
            "Hold for a moment & then release returning to the starting position",
            "Repeat"
        ],
        "tips": [
            "For this exercise to be maximally effective your back should not move at all through out the contraction & relaxation"
        ],
        "references": [],
        "svg": [
            "svg/0027-relaxation.svg",
            "svg/0027-tension.svg"
        ],
        "png": [
            "png/0027-relaxation.png",
            "png/0027-tension.png"
        ]
    },
    {
        "id": "0028",
        "name": "rear-deltoid-row-barbell",
        "title": "Rear Deltoid Row Barbell",
        "primer": "An exercise for shoulder & biceps strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "biceps brachii"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Place a barbell on the floor in front of you with the resided weights attached",
            "With your knees bent & back straight grasp the bar with a wide overh& grip (palms facing downwards)",
            "Keep your chest steady & your arms perpendicular to your chest",
            "Pull the bar as far up to your chest as you can",
            "Hold for a moment than lower the bar in a controlled manner",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0028-relaxation.svg",
            "svg/0028-tension.svg"
        ],
        "png": [
            "png/0028-relaxation.png",
            "png/0028-tension.png"
        ]
    },
    {
        "id": "0029",
        "name": "t-bar-rows",
        "title": "T-Bar Rows",
        "primer": "An exercise for middle back, biceps & shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Latissimus Dorsi"
        ],
        "secondary": [
            "biceps brachii",
            "Deltoid"
        ],
        "equipment": [
            "t-bar machine"
        ],
        "steps": [
            "Place your feet on either side of a T-Bar Machine",
            "With your knees slightly bent & abs drawn in, grasp the h&les with a narrow grip",
            "Bend at the waist so your chest is parallel to the floor, this is starting position. Slowly pull the bar to your chest, as high as you can",
            "Pause at the top for a moment & then lower the bar to starting position",
            "Repeat"
        ],
        "tips": [
            "Keep your back straight throughout this exercise in order to prevent injury",
            "Keep your elbows close to your body throughout the exercise"
        ],
        "references": [],
        "svg": [
            "svg/0029-relaxation.svg",
            "svg/0029-tension.svg"
        ],
        "png": [
            "png/0029-relaxation.png",
            "png/0029-tension.png"
        ]
    },
    {
        "id": "0030",
        "name": "barbell-shrugs",
        "title": "Barbell Shrugs",
        "primer": "An exercise for Trapezius strengthening",
        "type": "Isolation",
        "primary": [
            "Trapezius"
        ],
        "secondary": [],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "St& on the floor with your abs drawn in & your back straight",
            "Grasp a barbell with a grip a little wider than shoulder width at arms length",
            "Drop your shoulders as much as possible to start",
            "Raise your shoulder as high as possible",
            "Pause for a moment at the top & then return to starting position in a controlled motion",
            "Repeat"
        ],
        "tips": [
            "Do not arch your back at all during the exercise"
        ],
        "references": [],
        "svg": [
            "svg/0030-relaxation.svg",
            "svg/0030-tension.svg"
        ],
        "png": [
            "png/0030-relaxation.png",
            "png/0030-tension.png"
        ]
    },
    {
        "id": "0031",
        "name": "incline-shoulder-press-dumbbell",
        "title": "Incline Shoulder Press Dumbbell",
        "primer": "An exercise for shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Lie down on an incline bench with your feet flat on the floor & grasp the dumbbells",
            "With your elbows bent raise your arms up until in line with your shoulders this is your starting position",
            "With your abs drawn in, raise the dumbbells as high as you are able above your shoulders",
            "Lower the dumbbells in a slow controlled manner to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0031-relaxation.svg",
            "svg/0031-tension.svg"
        ],
        "png": [
            "png/0031-relaxation.png",
            "png/0031-tension.png"
        ]
    },
    {
        "id": "0032",
        "name": "bent-over-rear-deltoid-raise-with-head-on-bench",
        "title": "Bent Over Rear Deltoid Raise With Head On Bench",
        "primer": "An exercise for shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbells"
        ],
        "steps": [
            "Rest your forehead on an incline bench in oder to stabilise your movements so you are bent over with your back parallel to the floor, draw your abs in",
            "Grasp dumbbells in your h&s with your arms straight & elbows slightly bent ensuring they are not locked",
            "Slowly raise the dumbbells up to shoulder height",
            "Pause for a moment & then return to the starting position",
            "Repeat"
        ],
        "tips": [
            "ensure your back is straight & parallel to the floor throughout the exercise"
        ],
        "references": [],
        "svg": [
            "svg/0032-relaxation.svg",
            "svg/0032-tension.svg"
        ],
        "png": [
            "png/0032-relaxation.png",
            "png/0032-tension.png"
        ]
    },
    {
        "id": "0033",
        "name": "front-dumbbell-raise",
        "title": "Front Dumbbell Raise",
        "primer": "An exercise for shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbells"
        ],
        "steps": [
            "St& with a dumbbell in each h& with an overh& grip, your feet shoulder width apart & your abs drawn in",
            "Keeping each arm straight raise your left arm to just above shoulder height",
            "Pause for a moment then in a controlled motion lower the weight to starting position & repeat with your right arm",
            "<h3></h3>"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0033-relaxation.svg",
            "svg/0033-tension.svg"
        ],
        "png": [
            "png/0033-relaxation.png",
            "png/0033-tension.png"
        ]
    },
    {
        "id": "0034",
        "name": "internal-cable-rotation",
        "title": "Internal Cable Rotation",
        "primer": "An exercise for shoulder & biceps strengthening",
        "type": "Compound",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "biceps brachii"
        ],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Sit on the floor with your body close to low cable pulley",
            "Grasp the pulley with your left arm & position your elbow bent at 90 degree angle",
            "Pull the cable towards your body & internally rotate your shoulder until your forearm is across your abs",
            "Return to starting position",
            "Repeat with right arm"
        ],
        "tips": [
            "Ensure your back is straight throughout the exercise"
        ],
        "references": [],
        "svg": [
            "svg/0034-relaxation.svg",
            "svg/0034-tension.svg"
        ],
        "png": [
            "png/0034-relaxation.png",
            "png/0034-tension.png"
        ]
    },
    {
        "id": "0035",
        "name": "seated-rear-lateral-cable-raise",
        "title": "Seated Rear Lateral Cable Raise",
        "primer": "Tis is an exercise for shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Sit on the edge of a bench with your feet on the floor in front of you",
            "Rest your chest on your thighs with your back straight, grasp the cable pulleys with opposite h&s",
            "Raise your upper arms to shoulder height. Pause at the top for a moment",
            "Lower your arms to the starting position in a controlled motion",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0035-relaxation.svg",
            "svg/0035-tension.svg"
        ],
        "png": [
            "png/0035-relaxation.png",
            "png/0035-tension.png"
        ]
    },
    {
        "id": "0037",
        "name": "lying-one-arm-rear-lateral-raise",
        "title": "Lying One Arm Rear Lateral Raise",
        "primer": "An exercise for shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell",
            "flat bench"
        ],
        "steps": [
            "Lay face down on a flat bench high enough for your arms to hang down to the floor",
            "Place a dumbbell at your side",
            "Your other h& not grasping the dumbbell can be on the floor stabilising your movements",
            "Grasp the dumbbell in your h& & raise your upper arm to shoulder height",
            "Keep your arm straight & perpendicular to your chest with a slight bend in the elbow",
            "In a slow controlled manner lower your arm to starting position"
        ],
        "tips": [
            "Ensure your back is straight throughout this exercise"
        ],
        "references": [],
        "svg": [
            "svg/0037-relaxation.svg",
            "svg/0037-tension.svg"
        ],
        "png": [
            "png/0037-relaxation.png",
            "png/0037-tension.png"
        ]
    },
    {
        "id": "0038",
        "name": "one-arm-dumbbell-shoulder-press",
        "title": "One Arm Dumbbell Shoulder Press",
        "primer": "An exercise for shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "Triceps Brachii",
            "biceps brachii"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "St& with your feet shoulder width apart, back straight & abs drawn in",
            "Grasp a dumbbell in your h& & lift it with a bent elbow to your shoulder height to start",
            "Lift the dumbbell straight up till your arm is fully extended overhead",
            "Lower in a controlled manner & return to starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0038-relaxation.svg",
            "svg/0038-tension.svg"
        ],
        "png": [
            "png/0038-relaxation.png",
            "png/0038-tension.png"
        ]
    },
    {
        "id": "0039",
        "name": "one-arm-upright-row",
        "title": "Upright Row: Dumbbell (One Arm)",
        "primer": "An exercise for shoulder & Trapezius strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "Trapezius"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "St& near a post or other stable tall object. With your one h&, hold the post",
            "Grasp the dumbbell in your other h& with a pronated grip (palms facing backwards)",
            "Place the dumbbell in front of your thigh, this is starting position",
            "Lift the dumbbell upward to your shoulder with your elbow pointing away from your body in a rowing motion",
            "Lower your arm to starting position & repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0039-relaxation.svg",
            "svg/0039-tension.svg"
        ],
        "png": [
            "png/0039-relaxation.png",
            "png/0039-tension.png"
        ]
    },
    {
        "id": "0040",
        "name": "dumbbell-raise",
        "title": "Dumbbell Raise",
        "primer": "An exercise for shoulder & biceps strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "biceps brachii"
        ],
        "equipment": [
            "Dumbbells"
        ],
        "steps": [
            "St& upright with your feet shoulder width apart & a slight bend in your knees",
            "Grasp a dumbbell in each h&, in front of your thighs. This is your starting position",
            "Draw your abs in",
            "Raise the dumbbells up on either side of your ribs in a rowing motion by bending your elbows moving them outwards",
            "Lower to starting position & repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [],
        "png": []
    },
    {
        "id": "0041",
        "name": "smith-machine-shoulder-shrugs",
        "title": "Shoulder Shrugs: Smith Machine",
        "primer": "An exercise for shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [],
        "equipment": [
            "Smith Machine"
        ],
        "steps": [
            "Place the barbell at waist height",
            "St& with your feet shoulder width apart & your abs drawn in",
            "Grasp the bar with an overh& grip & straightened arms",
            "As you lift the bar allow the weight to pull your shoulders down, shrug your shoulders up & to the back",
            "Hold for a moment & then return to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0041-relaxation.svg",
            "svg/0041-tension.svg"
        ],
        "png": [
            "png/0041-relaxation.png",
            "png/0041-tension.png"
        ]
    },
    {
        "id": "0042",
        "name": "bench-press",
        "title": "Bench Press: Barbell",
        "primer": "An exercise for the chest",
        "type": "Compound",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii",
            "deltoideus (clavicula)"
        ],
        "equipment": [
            "Bench",
            "Barbell"
        ],
        "steps": [
            "Lie on a flat bench with your feet flat on the floor, keep your back flat on the bench",
            "Grasp the bar a little wider than shoulder width apart",
            "Raise the barbell above your body & move it over the middle of your chest, this is your starting position",
            "Lower the bar down so it just touches your chest",
            "Raise the bar till your arms are fully extended & your elbows are locked",
            "Return to starting position"
        ],
        "tips": [],
        "references": [
            "https://youtu.be/LnhpKTXeIeg"
        ],
        "svg": [
            "svg/0042-relaxation.svg",
            "svg/0042-tension.svg"
        ],
        "png": [
            "png/0042-relaxation.png",
            "png/0042-tension.png"
        ]
    },
    {
        "id": "0043",
        "name": "incline-bench-press",
        "title": "Bench Press: Barbell (Incline)",
        "primer": "An exercise for chest & triceps strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii"
        ],
        "equipment": [
            "bench (Incline)",
            "Barbell"
        ],
        "steps": [
            "Lie flat on an incline bench set at a 45 degree angle, with your feet shoulder width apart",
            "Grasp the bar a little wider than shoulder width apart",
            "Raise the barbell above your body & move it over the middle of your chest, this is your starting position",
            "Lower the bar down so it just touches your chest",
            "Raise the bar straight up till your arms are fully extended & your elbows are locked",
            "Return to starting position"
        ],
        "tips": [
            "Do not bounce the bar off your chest always maintain a controlled motion"
        ],
        "references": [],
        "svg": [
            "svg/0043-relaxation.svg",
            "svg/0043-tension.svg"
        ],
        "png": [
            "png/0043-relaxation.png",
            "png/0043-tension.png"
        ]
    },
    {
        "id": "0044",
        "name": "incline-bench-press-with-bands",
        "title": "Bench Press: Bands (Incline)",
        "primer": "An exercise for chest & biceps strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "biceps brachii"
        ],
        "equipment": [
            "exercise band",
            "bench (Incline)"
        ],
        "steps": [
            "Securely fasten the band under the leg of a flat bench, near your head",
            "Lie flat on the bench with your feet flat on the floor in order to stabilise your movements",
            "Grasp one end of the band in each h& & starting with your h&s at chest level",
            "Press upwards so your arms are fully extended",
            "With a slow controlled motion return to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0044-relaxation.svg",
            "svg/0044-tension.svg"
        ],
        "png": [
            "png/0044-relaxation.png",
            "png/0044-tension.png"
        ]
    },
    {
        "id": "0045",
        "name": "bent-arm-pullover",
        "title": "Bent Arm Pullover",
        "primer": "An exercise for chest, triceps, shoulders & lats strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Latissimus Dorsi",
            "Deltoid",
            "Triceps Brachii"
        ],
        "equipment": [
            "Barbell",
            "flat bench"
        ],
        "steps": [
            "Lie flat on a bench with your head hanging slightly over the end & your feet flat on the floor",
            "Hold a barbell with a close grip (approximately 14”), keep your elbows in throughout the exercise",
            "Starting with your arms fully extended over your chest, slowly lower the bar in an arc over your head & towards the floor",
            "Pull the bar back up to chest height in a slow controlled manner & return to starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0045-relaxation.svg",
            "svg/0045-tension.svg"
        ],
        "png": [
            "png/0045-relaxation.png",
            "png/0045-tension.png"
        ]
    },
    {
        "id": "0046",
        "name": "dumbbell-bent-arm-pullover",
        "title": "Dumbbell Bent Arm Pullover",
        "primer": "An exercise for chest, shoulder, lats & biceps strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Deltoid",
            "Triceps Brachii",
            "Latissimus Dorsi"
        ],
        "equipment": [
            "flat bench",
            "Dumbbell"
        ],
        "steps": [
            "Lie flat on a bench with your head hanging slightly over the end & your feet flat on the floor",
            "Hold a dumbbell with both h&s, keep your elbows in throughout the exercise",
            "Starting with your arms fully extended over your chest, slowly lower the dumbbell in an arc over your head & towards the floor",
            "Pull the dumbbell back up to chest height in a slow controlled manner & return to starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0046-relaxation.svg",
            "svg/0046-tension.svg"
        ],
        "png": [
            "png/0046-relaxation.png",
            "png/0046-tension.png"
        ]
    },
    {
        "id": "0047",
        "name": "butterfly-machine",
        "title": "Butterfly Machine",
        "primer": "An exercise for chest strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [],
        "equipment": [
            "machine: butterfly"
        ],
        "steps": [
            "Adjust the machine so you are sitting at chest heights with the pads",
            "Sit on the machine with your back flat",
            "Place your forearms on the pads, parallel to the floor, this is starting position",
            "Using your forearms, push the pads together slowly as you squeeze your chest",
            "Return your arms to the stretched out starting position in a controlled motion",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [],
        "png": []
    },
    {
        "id": "0048",
        "name": "cable-crossover",
        "title": "Cable Crossover",
        "primer": "An exercise for chest & shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Deltoid"
        ],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Attach the cable pulley to shoulder height",
            "Grasp the pulley in both h&s & st& approximately one foot in front of the weight stacks, with one foot slightly in front of the other",
            "With a slight bend in your elbows bring your h& together in front of your chest on downward angle",
            "When your h&s meet at the midpoint of your chest, hold for a moment",
            "With a slow controlled motion return to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0048-relaxation.svg",
            "svg/0048-tension.svg"
        ],
        "png": [
            "png/0048-relaxation.png",
            "png/0048-tension.png"
        ]
    },
    {
        "id": "0049",
        "name": "close-grip-barbell-bench-press",
        "title": "Bench Press: Barbell (Close Grip)",
        "primer": "An exercise for chest, triceps & shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii",
            "Deltoid"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Lie on a flat bench with your feet flat on the floor, keep your back flat on the bench",
            "Grasp the bar a close grip (approximately 14” apart)",
            "Raise the barbell above your body & move it over the middle of your chest, this is your starting position",
            "Lower the bar down so it just touches your chest",
            "Raise the bar till your arms are fully extended & your elbows are locked",
            "Return to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0049-relaxation.svg",
            "svg/0049-tension.svg"
        ],
        "png": [
            "png/0049-relaxation.png",
            "png/0049-tension.png"
        ]
    },
    {
        "id": "0050",
        "name": "crossover-bands",
        "title": "Crossover with Bands",
        "primer": "An exercise for chest, biceps & shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Deltoid",
            "biceps brachii"
        ],
        "equipment": [
            "exercise band"
        ],
        "steps": [
            "An exercise for chest, biceps & shoulder strengthening",
            "Secure an exercise to a post (or secure pole) & hold it in each h&",
            "Step forward so the band has some tension, facing away from the post",
            " Your arms at mid chest height & out to the side, palms facing forward this is your starting position",
            "Bring your h&s together in front of you",
            "Hold this for a moment & then in a controlled motion return to starting position"
        ],
        "tips": [
            "Keep your arms straight with a slight bend in your elbows throughout this exercise"
        ],
        "references": [],
        "svg": [
            "svg/0050-relaxation.svg",
            "svg/0050-tension.svg"
        ],
        "png": [
            "png/0050-relaxation.png",
            "png/0050-tension.png"
        ]
    },
    {
        "id": "0051",
        "name": "decline-barbell-bench-press",
        "title": "Bench Press: Barbell (Decline)",
        "primer": "An exercise for chest, triceps & shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii",
            "Deltoid"
        ],
        "equipment": [
            "bench: decline",
            "Barbell"
        ],
        "steps": [
            "Lie on a decline bench with your head lower than your feet",
            "Grasp the bar at a grip 3-6 inches wider than your shoulders",
            "Raise the bar above your chest, keeping your elbows close in",
            "Slowly & with control lower the bar straight to your lower chest",
            "Raise the bar back up to starting position with the bar just above your chest",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0051-relaxation.svg",
            "svg/0051-tension.svg"
        ],
        "png": [
            "png/0051-relaxation.png",
            "png/0051-tension.png"
        ]
    },
    {
        "id": "0052",
        "name": "decline-dumbbell-bench-press",
        "title": "Bench Press: Dumbbell (Decline)",
        "primer": "An exercise for chest, shoulder & triceps strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii",
            "Deltoid"
        ],
        "equipment": [
            "Dumbbells",
            "bench: decline"
        ],
        "steps": [
            "Grasp the dumbbells your h&s & lie on a decline bench with your head lower than your feet",
            "Raise the dumbbells above your chest, bringing your elbows close in, this is your starting position",
            "Slowly & with control lower the dumbbells to either side of your lower chest",
            "Raise the dumbbells back up to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0052-relaxation.svg",
            "svg/0052-tension.svg"
        ],
        "png": [
            "png/0052-relaxation.png",
            "png/0052-tension.png"
        ]
    },
    {
        "id": "0053",
        "name": "decline-dumbbell-flys",
        "title": "Decline Dumbbell Fly's",
        "primer": "An exercise for chest & shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Deltoid"
        ],
        "equipment": [
            "Dumbbells",
            "bench: decline"
        ],
        "steps": [
            "Lie on a decline bench with your head lower than your body & your feet firmly on the ground",
            "With dumbbells together above your shoulders & your arms straight out above you as your starting position",
            "Keeping your arms straight & with a slight bend in your elbows lower the dumbbells down towards the floor in an arc, up until just above your shoulders",
            "Return to the starting position in a slow controlled manner",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0053-relaxation.svg",
            "svg/0053-tension.svg"
        ],
        "png": [
            "png/0053-relaxation.png",
            "png/0053-tension.png"
        ]
    },
    {
        "id": "0054",
        "name": "chest-dips",
        "title": "Chest Dips",
        "primer": "An exercise for chest, triceps & shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii",
            "Deltoid"
        ],
        "equipment": [
            "Body",
            "parallel bars"
        ],
        "steps": [
            "St& in between the parallel bars",
            "Grip the h&les of the parallel bars & push yourself up to the starting position with straightened arms",
            "With your elbows close to your body keep your hips straight, lower your body forward by bending your elbows so your chest is leading as you go down",
            "Raise yourself back up to the starting position & repeat",
            "Repeat"
        ],
        "tips": [
            "Ensure not to lock your elbows once you have raised yourself up"
        ],
        "references": [],
        "svg": [
            "svg/0054-relaxation.svg",
            "svg/0054-tension.svg"
        ],
        "png": [
            "png/0054-relaxation.png",
            "png/0054-tension.png"
        ]
    },
    {
        "id": "0055",
        "name": "bench-press-dumbbell",
        "title": "Bench Press: Dumbbell",
        "primer": "This is  an exercise for chest,triceps & shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Deltoid",
            "Triceps Brachii"
        ],
        "equipment": [
            "Dumbbells",
            "flat bench"
        ],
        "steps": [
            "An exercise for chest, triceps & shoulder strengthening",
            "Grasp the dumbbells in each h& & lie on a flat bench with your feet firmly on the ground",
            "Extend your arms up over your chest with your palms facing forwards",
            "Press the dumbbells up over your chest till your arm are fully extended this is your starting position",
            "Bend your elbows to a 90 degree angle so your upper arms are parallel with the floor",
            "Slowly lower the dumbbells as low as comfortable along your chest",
            "With a controlled motion return back to your starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0055-relaxation.svg",
            "svg/0055-tension.svg"
        ],
        "png": [
            "png/0055-relaxation.png",
            "png/0055-tension.png"
        ]
    },
    {
        "id": "0056",
        "name": "dumbbell-flys",
        "title": "Dumbbell Flys",
        "primer": "An exercise for chest, triceps & shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Deltoid",
            "Triceps Brachii"
        ],
        "equipment": [
            "flat bench",
            "Dumbbells"
        ],
        "steps": [
            "Lie on a flat bench with a dumbbell in each h& & your feet firmly on the ground",
            "Lift the dumbbells over your chest extending your arms fully with a slight bend in your elbows, this is your starting position",
            "Keeping a slight bend in your elbows, lower the dumbbells to the floor in an arc like motion",
            "Slowly return the dumbbells over your chest to the starting position in a controlled motion",
            "Repeat"
        ],
        "tips": [
            "Ensure your back & hips remain in contact with the bench at all times during this exercise"
        ],
        "references": [],
        "svg": [
            "svg/0056-relaxation.svg",
            "svg/0056-tension.svg"
        ],
        "png": [
            "png/0056-relaxation.png",
            "png/0056-tension.png"
        ]
    },
    {
        "id": "0057",
        "name": "flat-bench-cable-flys",
        "title": "Flat Bench Cable Flys",
        "primer": "An exercise for chest & shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Deltoid"
        ],
        "equipment": [
            "flat bench",
            "cable"
        ],
        "steps": [
            "<h3> Steps</h3>",
            "Lie on flat bench between two cable towers & your feet firmly on the ground",
            "Grasp a pulley in each h& with your palms facing up",
            "With a slight bend in your elbows, squeeze your chest & pull the cables together meeting in the middle of your chest",
            "Hold for a moment & then slowly lower your h&s back to starting position at bench height",
            "<h3>Tip</h3>",
            "Ensure your back & hips stay in contact with the bench at all times during this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0057-relaxation.svg",
            "svg/0057-tension.svg"
        ],
        "png": [
            "png/0057-relaxation.png",
            "png/0057-tension.png"
        ]
    },
    {
        "id": "0058",
        "name": "barbell-front-raise-pullover",
        "title": "Barbell Front Raise & Pullover",
        "primer": "An exercise for chest, triceps & shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii",
            "Deltoid"
        ],
        "equipment": [
            "Barbell",
            "flat bench"
        ],
        "steps": [
            "Lie on a flat bench & grasp a barbell using a medium grip (about 15” apart)",
            "Place the barbell on your upper thighs & lock your arms straight with a slight bend in your elbows",
            "Draw your abs in & keeping your back flat on the bench, raise your arms up in an arc over & behind your head (as if you were performing a reverse pullover)",
            "Slowly return the barbell to the starting position on your thighs"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0058-relaxation.svg",
            "svg/0058-tension.svg"
        ],
        "png": [
            "png/0058-relaxation.png",
            "png/0058-tension.png"
        ]
    },
    {
        "id": "0059",
        "name": "hammer-grip-incline-bench-press",
        "title": "Bench Press: Dumbbell (Incline, Hammer Grip)",
        "primer": "An advanced exercise for strengthening the chest, triceps & shoulders",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Deltoid",
            "Triceps Brachii"
        ],
        "equipment": [
            "Dumbbells",
            "bench (Incline)"
        ],
        "steps": [
            "Grasp a dumbbell in each h& & lay on an incline bench set at a 45 degree angle",
            "Keep your feet flat on the floor & your back against the bench at all times",
            "Using a hammer grip (with your palms facing each other), lift the weights to shoulder height on either side of your chest",
            "Extend your arms fully & press the dumbbells up",
            "Slowly return the dumbbells to the starting position at the sides of your chest"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0059-relaxation.svg",
            "svg/0059-tension.svg"
        ],
        "png": [
            "png/0059-relaxation.png",
            "png/0059-tension.png"
        ]
    },
    {
        "id": "0060",
        "name": "incline-cable-flys",
        "title": "Incline Cable Fly's",
        "primer": "This exercise is an alternative to the Butterfly or Pec Deck, it defines the muscles of the chest.Place an incline bench set at a 45 degree angle between two cable towers",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "biceps brachii",
            "Triceps Brachii",
            "forearm"
        ],
        "equipment": [
            "bench (Incline)",
            "cable"
        ],
        "steps": [
            "Place an incline bench set at a 45 degree angle between two cable towers",
            "Grasp a pulley in each h& with your palms facing up",
            "With a slight bend in your elbows, squeeze your chest & pull the cables in an arc so they meet together in the middle of your chest",
            "Hold for a moment & then slowly lower your h&s back to starting position at along the same arc"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0060-relaxation.svg",
            "svg/0060-tension.svg"
        ],
        "png": [
            "png/0060-relaxation.png",
            "png/0060-tension.png"
        ]
    },
    {
        "id": "0061",
        "name": "dumbbell-incline-bench-press",
        "title": "Bench Press: Dumbbell (Incline)",
        "primer": "An advanced exercise for building & sculpting the chest as well as your triceps & shoulders",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii",
            "Deltoid"
        ],
        "equipment": [
            "Dumbbells",
            "bench (Incline)"
        ],
        "steps": [
            "Lie on an incline bench which has been set to an incline of 45 degrees",
            "Start with the dumbbells at shoulder height, your arms wide & elbows pointing down to the floor",
            "Grasp the dumbbells with a grip so your palms face each other",
            "Raise your arms up over your chest bringing the dumbbells closer together as they meet over your chest, as if you were clapping",
            "Slowly return the dumbbells to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0061-relaxation.svg",
            "svg/0061-tension.svg"
        ],
        "png": [
            "png/0061-relaxation.png",
            "png/0061-tension.png"
        ]
    },
    {
        "id": "0062",
        "name": "incline-dumbbell-flys",
        "title": "Incline Dumbbell Fly's",
        "primer": "An exercise for chest sculpting & strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Deltoid"
        ],
        "equipment": [
            "bench (Incline)",
            "Dumbbells"
        ],
        "steps": [
            "Lie on an incline bench set a 45 degree angle with a dumbbell in each h& & your feet firmly on the ground",
            "Lift the dumbbells over your chest extending your arms fully & your palms facing each other",
            "Keeping a slight bend in your elbows, lower the dumbbells towards the floor in & arc like motion",
            "Slowly return to starting position"
        ],
        "tips": [
            "Ensure your hips & back remain in contact with the bench throughout the exercise"
        ],
        "references": [],
        "svg": [
            "svg/0062-relaxation.svg",
            "svg/0062-tension.svg"
        ],
        "png": [
            "png/0062-relaxation.png",
            "png/0062-tension.png"
        ]
    },
    {
        "id": "0063",
        "name": "incline-flys-twist",
        "title": "Incline Fly's with a Twist",
        "primer": "An exercise for chest sculpting & strengthening which is very similar to the incline fly's",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Deltoid"
        ],
        "equipment": [
            "bench (Incline)",
            "Dumbbells"
        ],
        "steps": [
            "Lie on an incline bench set at a 45 degree angle with a dumbbell in each h& & your feet flat on the ground",
            "Start with the dumbbells out to the sides of your chest, parallel to the floor as you would a regular Fly",
            "Raise the dumbbells over your chest in & arc, at the top turn your pinky finger in so they are facing each other",
            "Slowly return to starting position",
            "Repeat"
        ],
        "tips": [
            "Ensure your hips & back remain in contact with the bench at all times throughout the exercise"
        ],
        "references": [],
        "svg": [
            "svg/0063-relaxation.svg",
            "svg/0063-tension.svg"
        ],
        "png": [
            "png/0063-relaxation.png",
            "png/0063-tension.png"
        ]
    },
    {
        "id": "0064",
        "name": "wide-grip-decline-barbell-pullover",
        "title": "Wide Grip Decline Barbell Pullover",
        "primer": "An advanced strengthening exercise which targets the pectoral or chest muscles",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [],
        "equipment": [
            "bench: decline",
            "Barbell"
        ],
        "steps": [
            "Lie on a decline bench with your feet higher than your head & your feet firmly on the ground",
            "Grasp the barbell with an extra wide grip (your h&s near the plates) & starting at you’re your upper thighs raise the barbell in an arc over your head towards the floor",
            "Slowly return the barbell to starting position on your thighs",
            "Repeat"
        ],
        "tips": [
            "Ensure your back & hips remain in contact with the bench at all times"
        ],
        "references": [],
        "svg": [
            "svg/0064-relaxation.svg",
            "svg/0064-tension.svg"
        ],
        "png": [
            "png/0064-relaxation.png",
            "png/0064-tension.png"
        ]
    },
    {
        "id": "0066",
        "name": "machine-bench-press",
        "title": "Bench Press: Machine",
        "primer": "An exercise for chest, biceps & shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii",
            "Deltoid"
        ],
        "equipment": [
            "machine: bench press"
        ],
        "steps": [
            "Adjust the machine so that you are sitting with the bars at chest height",
            "Place your h&s on the bars & place your feet on the foot rest",
            "Press out, extending your arms as far as possible in a steady motion",
            "Pause for a moment & then return slowly to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0066-relaxation.svg",
            "svg/0066-tension.svg"
        ],
        "png": [
            "png/0066-relaxation.png",
            "png/0066-tension.png"
        ]
    },
    {
        "id": "0067",
        "name": "barbell-neck-press",
        "title": "Barbell Neck Press",
        "primer": "An advanced exercise for chest strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "biceps brachii"
        ],
        "equipment": [
            "Barbell",
            "flat bench"
        ],
        "steps": [
            "Lie on a flat bench with you feet planted firmly on the floor",
            "Grasp the bar a little wider than shoulder width apart",
            "Raise the barbell above your body & move it to the top of your chest, near your neck",
            "This is your starting position",
            "Lower the bar down so it just touches the top of your chest",
            "Raise the bar till your arms are fully extended & your elbows are locked",
            "Return to starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0067-relaxation.svg",
            "svg/0067-tension.svg"
        ],
        "png": [
            "png/0067-relaxation.png",
            "png/0067-tension.png"
        ]
    },
    {
        "id": "0068",
        "name": "one-arm-bench-press",
        "title": "Bench Press: Dumbbell (One Arm)",
        "primer": "An advanced strengthening exercise for the chest & rotator cuff muscles of the shoulder",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii",
            "Deltoid"
        ],
        "equipment": [
            "flat bench",
            "Dumbbell"
        ],
        "steps": [
            "Lie flat on a bench with your feet placed firmly on the floor & your abs drawn in",
            "Grasp the dumbbell in one h& & bring it up to the side of your chest, this is starting position",
            "Extend your arm, pressing the dumbbell up till your arm is straight & your elbow locked",
            "Using slow controlled movements, lower the weight to starting position",
            "Switch arms after completing reps with one arm",
            "Repeat"
        ],
        "tips": [
            "Ensure your hips & back remain in contact with the bench at all times during this exercise",
            "Start with a lighter weight in order to perfect the exercise technique & then when progressing onto a heavier weight you should be spotted to ensure safety & injury prevention"
        ],
        "references": [],
        "svg": [
            "svg/0068-relaxation.svg",
            "svg/0068-tension.svg"
        ],
        "png": [
            "png/0068-relaxation.png",
            "png/0068-tension.png"
        ]
    },
    {
        "id": "0069",
        "name": "bosu-ball-push-up",
        "title": "Push Up: Bosu Ball",
        "primer": "An exercise for chest, core, shoulders & triceps strengthening with the use of a Bosu ball",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Deltoid",
            "core",
            "Triceps Brachii"
        ],
        "equipment": [
            "bosu ball"
        ],
        "steps": [
            "Place the Bosu ball flat side down on the floor",
            "Kneel on the floor with your arms fully extended on the ball, & body straight",
            "Keeping your abs drawn in & your body straight, by bending your elbows lower your chest to the ball",
            "Pause for a moment & then return to starting position",
            "Repeat"
        ],
        "tips": [
            "Ensure your elbows remain close to your body while lowering your chest to the ball",
            "Beginners may want to start on your knees with your feet off the ground so you are rocking into the Push Up"
        ],
        "references": [],
        "svg": [
            "svg/0069-relaxation.svg",
            "svg/0069-tension.svg"
        ],
        "png": [
            "png/0069-relaxation.png",
            "png/0069-tension.png"
        ]
    },
    {
        "id": "0070",
        "name": "one-arm-barbell-floor-press",
        "title": "One Arm Barbell Floor Press",
        "primer": "An exercise for chest & triceps strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Lie flat on your back with your knees bent & your feet firmly on the floor",
            "Draw in your abs & contract your lats, & glutes",
            "Have your partner h& you the bar & with your bicep parallel to the floor lift & extend your arm fully so it is straight",
            "Return to the starting position",
            "Complete reps & switch arms"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0070-relaxation.svg",
            "svg/0070-tension.svg"
        ],
        "png": [
            "png/0070-relaxation.png",
            "png/0070-tension.png"
        ]
    },
    {
        "id": "0071",
        "name": "one-arm-flat-bench-flys",
        "title": "One Arm Flat Bench Fly’s",
        "primer": "An exercise for chest strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [],
        "equipment": [
            "flat bench",
            "Dumbbell"
        ],
        "steps": [
            "Lie on a flat bench with your free h& holding the bench",
            "Grasp the dumbbell in your other h& & with your forearm parallel to the floor raise your arm in an arc the middle of your chest",
            "Once the dumbbell is at the middle of your chest line, slowly lower is along the same path to starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0071-relaxation.svg",
            "svg/0071-tension.svg"
        ],
        "png": [
            "png/0071-relaxation.png",
            "png/0071-tension.png"
        ]
    },
    {
        "id": "0072",
        "name": "one-armed-biased-push-up",
        "title": "One Armed Biased Push Up",
        "primer": "An exercise for chest strengthening but also strengthens ones core, shoulders, biceps & triceps",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii",
            "bicpes",
            "Deltoid",
            "core"
        ],
        "equipment": [
            "bosu ball"
        ],
        "steps": [
            "Arrange the ball so that as you begin the exercise, one h& on the Bosu ball & the other on the floor",
            "Place the ball flat side down on the floor",
            "Kneel on the floor with your arms fully extended on the dome, & body straight",
            "Keeping your abs drawn in & your body straight, lower your chest to the ball",
            "Pause for a moment & then return to starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0072-relaxation.svg",
            "svg/0072-tension.svg"
        ],
        "png": [
            "png/0072-relaxation.png",
            "png/0072-tension.png"
        ]
    },
    {
        "id": "0073",
        "name": "push-ups-close-&-wide-h&-versions",
        "title": "Push Up: Close & Wide H&",
        "primer": "These are variations on Push Ups, one of the best exercise for muscles of the chest (pectorals), arms (bicep & triceps) & core development. The core muscles are the rectus abdomen & oblique’s which support the spine",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii",
            "Deltoid",
            "core"
        ],
        "equipment": [
            "Body"
        ],
        "steps": [
            "For a Close Grip Push Up lay face down on the floor, or a mat, with your feet together curled slightly so you rise on the ball of your feet",
            "Place you h&s close together so your thumbs & index fingers form a triangle on the floor",
            "Draw your abs in & inhale as you raise your body up till your arms are straight",
            "Keep your head & neck level with your body (don’t look up or down) & don’t allow your back to rise or fall",
            "Exhale out as you lower your body back to the ground",
            "For a Wide Grip Push Up move your h&s out to a position slightly wider than your shoulders",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [],
        "png": []
    },
    {
        "id": "0075",
        "name": "push-up-feet-elevated",
        "title": "Push Up: Bench (Feet Elevated)",
        "primer": "This is the same general movement as with a Push Up except your feet are elevated allowing greater range of motions & targeting the pectorals differently than the regular Push Up",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major",
            "Deltoid"
        ],
        "secondary": [
            "Triceps Brachii"
        ],
        "equipment": [
            "Body",
            "Bench"
        ],
        "steps": [
            "Place your feet on a bench at least 18” off the ground",
            "Make sure the tops of your feet are flush against the bench",
            "Place your h&s on the floor slightly wider than shoulder width apart",
            "With your h&s directly under your shoulders, press up from the floor, keeping your back & neck in a straight line so you are looking forward during the entire exercise",
            "Once your arms are fully extended pause & then with slow controlled movements lower yourself to the floor again"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0075-relaxation.svg",
            "svg/0075-tension.svg"
        ],
        "png": [
            "png/0075-relaxation.png",
            "png/0075-tension.png"
        ]
    },
    {
        "id": "0076",
        "name": "push-ups-with-feet-on-exercise-ball",
        "title": "Push Up: Exercise ball",
        "primer": "This is similar to the st&ard Push Up except using an Exercise Ball forces you to engage the muscle of your core (Rectus Abdominis, Transverse Abdominis, & the Obliques)",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii",
            "Deltoid"
        ],
        "equipment": [
            "Body",
            "exercise ball"
        ],
        "steps": [
            "Place your feet & shins flat on an Exercise Ball",
            "Place your arms in front of you at shoulder width apart, place your h&s under your arms & press up from the ground until your arms are fully extended",
            "Pause at the top for a moment & steady your balance",
            "Slowly return to the starting position with your chest lowered towards the ground"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0076-relaxation.svg",
            "svg/0076-tension.svg"
        ],
        "png": [
            "png/0076-relaxation.png",
            "png/0076-tension.png"
        ]
    },
    {
        "id": "0077",
        "name": "push-ups",
        "title": "Push Up: Body Weight",
        "primer": "This exercise is the main strengthening exercise when wanting to strengthen ones chest, biceps & triceps as well as core muscles",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii",
            "Deltoid"
        ],
        "equipment": [
            "Body"
        ],
        "steps": [
            "Start with a basic push up, lay face down on the floor, or a mat; with your feet together curled slightly so you rise onto the ball of your feet",
            "Place you h&s shoulder width apart on the either side of your chest",
            "Draw your abs in",
            "Inhale as you raise your body up till your arms are straight",
            "Keep your head & neck level with your body (don’t look up or down) & don’t allow your back to rise or fall",
            "Exhale out as you lower your body back to the ground",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0077-relaxation.svg",
            "svg/0077-tension.svg"
        ],
        "png": [
            "png/0077-relaxation.png",
            "png/0077-tension.png"
        ]
    },
    {
        "id": "0078",
        "name": "smith-machine-bench-press",
        "title": "Bench Press: Smith Machine",
        "primer": "With the use of a Smith Machine this exercise strengthens your chest shoulders & triceps",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Deltoid",
            "Triceps Brachii"
        ],
        "equipment": [
            "flat bench",
            "Smith Machine"
        ],
        "steps": [
            "Place a flat bench in the middle of the Smith Machine, with the bar in line with the middle of your chest",
            "Lying on the bench, grasp the bar at shoulder width apart",
            "Unlatch the bar & slowly lower the bar to your chest",
            "Extend your arms fully & raise the bar to the starting position",
            "Repeat"
        ],
        "tips": [
            "Ensure your hips & back remain in contact with the bench throughout this exercise"
        ],
        "references": [],
        "svg": [
            "svg/0078-relaxation.svg",
            "svg/0078-tension.svg"
        ],
        "png": [
            "png/0078-relaxation.png",
            "png/0078-tension.png"
        ]
    },
    {
        "id": "0079",
        "name": "straight-arm-dumbbell-pullover",
        "title": "Straight Arm Dumbbell Pullover",
        "primer": "An exercise for chest & shoulder strengthening which mainly targets the rotator cuff muscles",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii",
            "Latissimus Dorsi",
            "Deltoid"
        ],
        "equipment": [
            "flat bench",
            "Dumbbell"
        ],
        "steps": [
            "Lie on a flat bench with your feet flat on the floor & your head at the end of the bench",
            "Grasp a dumbbell & raise it over your chest",
            "Keeping your elbows as straight as possible, lower the weight in an arc over your head & as low to the ground as possible with out any pain",
            "Return to starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0079-relaxation.svg",
            "svg/0079-tension.svg"
        ],
        "png": [
            "png/0079-relaxation.png",
            "png/0079-tension.png"
        ]
    },
    {
        "id": "0080",
        "name": "incline-dumbbell-press",
        "title": "Incline Dumbbell Press",
        "primer": "This exercises is for mainly chest strengthening but also strengthens your triceps & shoulders",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii",
            "Deltoid"
        ],
        "equipment": [
            "Dumbbells",
            "bench (Incline)"
        ],
        "steps": [
            "Set & incline bench at a 45 degree angle",
            "Start with the dumbbells at shoulder height, your arms wide & elbows pointing down to the floor",
            "Raise your arms up over your chest bringing the dumbbells closer together as they meet over your chest",
            "Slowly return the dumbbells to starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0080-relaxation.svg",
            "svg/0080-tension.svg"
        ],
        "png": [
            "png/0080-relaxation.png",
            "png/0080-tension.png"
        ]
    },
    {
        "id": "0081",
        "name": "smith-machine-incline-bench-press",
        "title": "Bench Press: Smith Machine (Incline)",
        "primer": "An exercise for chest, shoulder & triceps strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Deltoid",
            "Triceps Brachii"
        ],
        "equipment": [
            "Smith Machine",
            "bench (Incline)"
        ],
        "steps": [
            "Place an incline bench at a 45 degree angle in the middle of the Smith Machine",
            "Align the bench so the bar is across the upper portion of your chest",
            "Grasp the bar with a shoulder width grip",
            "Unlock the bar & slowly lower the weight to your chest, do not bounce the bar on your chest",
            "With slow controlled movements, raise the bar back to the starting position"
        ],
        "tips": [
            "when you are doing this exercise for the first time, start on a lower weight in oder to perfect the technique"
        ],
        "references": [],
        "svg": [
            "svg/0081-relaxation.svg",
            "svg/0081-tension.svg"
        ],
        "png": [
            "png/0081-relaxation.png",
            "png/0081-tension.png"
        ]
    },
    {
        "id": "0082",
        "name": "wide-grip-bench-press",
        "title": "Bench Press: Barbell (Wide Grip)",
        "primer": "An exercise for chest, triceps & shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii",
            "Deltoid"
        ],
        "equipment": [
            "flat bench",
            "Barbell"
        ],
        "steps": [
            "Lie flat on a bench with your feet flat on the floor",
            "Place your h&s wider than shoulder width apart on the bar & lift it off the rack, this is starting position",
            "Bring the bar over your chest & lower it till it is just above your body",
            "Extend your arms upward & raise the bar straight up",
            "Pause for a moment & with slow controlled movement, return the bar to starting position",
            "Repeat"
        ],
        "tips": [
            "Ensure that your hips & back remain in contact through out the exercise"
        ],
        "references": [],
        "svg": [
            "svg/0082-relaxation.svg",
            "svg/0082-tension.svg"
        ],
        "png": [
            "png/0082-relaxation.png",
            "png/0082-tension.png"
        ]
    },
    {
        "id": "0083",
        "name": "wide-grip-decline-bench-press",
        "title": "Bench Press: Barbell (Decline, Wide Grip)",
        "primer": "An exercise for chest, triceps & shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii",
            "Deltoid"
        ],
        "equipment": [
            "Barbell",
            "bench: decline"
        ],
        "steps": [
            "Lie on a decline bench with your head lower than your feet",
            "Place your h&s wider than shoulder width apart on the bar & lift it off the rack",
            "Bring the bar over your chest & lower it till it is just above the lower portion of your chest, this is starting position",
            "Extend your arms upward & raise the bar straight up",
            "Pause for a moment & then lower the bar to starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0083-relaxation.svg",
            "svg/0083-tension.svg"
        ],
        "png": [
            "png/0083-relaxation.png",
            "png/0083-tension.png"
        ]
    },
    {
        "id": "0084",
        "name": "incline-chest-press",
        "title": "Incline Chest Press",
        "primer": "This exercise is for strengthening the upper chest & is preferred among beginners as it provides support & control",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii",
            "Deltoid"
        ],
        "equipment": [
            "chest machine"
        ],
        "steps": [
            "Adjust the seat of the machine so that the h&les are near the upper portion of your chest",
            "Slowly press the h&les forward until your h&s are fully extended, do not lock your elbows",
            "Pause for a moment & then with a controlled movement lower your h&s back to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [],
        "png": []
    },
    {
        "id": "0085",
        "name": "decline-chest-press",
        "title": "Decline Chest Press",
        "primer": "An exercise for the strengthening of the lower chest or pectoral muscles & is preferred by beginners as it provides support & stability",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Deltoid",
            "Triceps Brachii"
        ],
        "equipment": [
            "machine: chest"
        ],
        "steps": [
            "Adjust the seat of the machine so that the h&les are near the lower portion of your chest",
            "Slowly press the h&les forward until your h&s are fully extended, do not lock your elbows",
            "Pause for a moment & then with a controlled movement lower your h&s back to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0085-relaxation.svg",
            "svg/0085-tension.svg"
        ],
        "png": [
            "png/0085-relaxation.png",
            "png/0085-tension.png"
        ]
    },
    {
        "id": "0086",
        "name": "body-row",
        "title": "Body Row",
        "primer": "This is a good overall exercise which strengthens your chest, core & back muscles",
        "type": "Compound",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "core",
            "Trapezius",
            "back"
        ],
        "equipment": [
            "bar"
        ],
        "steps": [
            "Lie under a bar so that the bar is at mid chest level & your feet are firmly on the floor",
            "Draw your abs in & keep your back flat",
            "Using your arms, lift & row your body towards the bar",
            "Pause for a moment & with slow controlled movements lower your self back to starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0086-relaxation.svg",
            "svg/0086-tension.svg"
        ],
        "png": [
            "png/0086-relaxation.png",
            "png/0086-tension.png"
        ]
    },
    {
        "id": "0087",
        "name": "pull-ups",
        "title": "Pull Ups",
        "primer": "An exercise in lats, biceps & middle back strengthening",
        "type": "Isolation",
        "primary": [
            "Latissimus Dorsi"
        ],
        "secondary": [
            "biceps brachii"
        ],
        "equipment": [
            "bar"
        ],
        "steps": [
            "Grab the pull-up bar with the palms facing forward using the prescribed grip",
            "As you have both arms extended in front of you holding the bar at the chosen grip width, bring your torso back around 30 degrees or so while creating a curvature on your lower back & sticking your chest out. This is your starting position",
            "Pull your torso up until the bar touches your upper chest by drawing the shoulders & the upper arms down & back. Exhale as you perform this portion of the movement",
            "After a second on the contracted position, start to inhale & slowly lower your torso back to the starting position when your arms are fully extended & the lats are fully stretched",
            "Repeat this motion",
            "<h3> Tip</h3>",
            "Concentrate on squeezing the back muscles once you reach the full contracted position. The upper torso should remain stationary as it moves through space & only the arms should move. The forearms should do no other work other than hold the bar"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0087-relaxation.svg",
            "svg/0087-tension.svg"
        ],
        "png": [
            "png/0087-relaxation.png",
            "png/0087-tension.png"
        ]
    },
    {
        "id": "0088",
        "name": "gironda-sternum-chins",
        "title": "Gironda Sternum Chins",
        "primer": "An exercise for lats, biceps & middle back strengthening; which is similar t the basic chin up but focusses more on lats",
        "type": "Isolation",
        "primary": [
            "Latissimus Dorsi"
        ],
        "secondary": [
            "biceps brachii"
        ],
        "equipment": [
            "Body",
            "bar"
        ],
        "steps": [
            "Grasp the pull up bar with a shoulder width underh& grip",
            "Hang from the bar with your arms fully extended",
            "Pulling yourself towards the bar lean your head back as far as you can & arch your spine",
            "Continuing pulling so that your collarbone passes the bar & you are able to touch your sternum to the bar",
            "Slowly lower yourself back to starting position",
            "Repeat this motion"
        ],
        "tips": [
            "Ensure you contract your core & back muscles through out this exercise in order to prevent injury & maximise the effectiveness of this exercise"
        ],
        "references": [],
        "svg": [],
        "png": []
    },
    {
        "id": "0089",
        "name": "chin-ups",
        "title": "Chin Ups",
        "primer": "An extremely good exercise for upper arm & middle back strengthening",
        "type": "Isolation",
        "primary": [
            "Latissimus Dorsi"
        ],
        "secondary": [
            "biceps brachii"
        ],
        "equipment": [
            "Body",
            "bar"
        ],
        "steps": [
            "Grasp the bar with an supinated (overh&) grip",
            "Let your body hang from the bar with your arms straight",
            "Slowly pull yourself up so that your chin is higher than the bar",
            "With a controlled movement lower yourself to the starting position"
        ],
        "tips": [
            "Ensure to contract your back & core muscles throughout this exercise to prevent injury & to maximise the effectiveness of the exercise"
        ],
        "references": [],
        "svg": [],
        "png": []
    },
    {
        "id": "0090",
        "name": "narrow-parallel-grip-chin-ups",
        "title": "Narrow Parallel Grip Chin-ups",
        "primer": "An exercise similar to the regular Chin Up but focuses more on shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid",
            "Latissimus Dorsi"
        ],
        "secondary": [
            "back",
            "core"
        ],
        "equipment": [
            "bar",
            "Body"
        ],
        "steps": [
            "Grasp the bar with an supinated (overh&) grip so that your palms are facing",
            "Let your body hang from the bar with your arms straight",
            "Slowly pull yourself up so that your chin is higher than the bar",
            "With a controlled movement lower yourself to the starting position",
            "Repeat"
        ],
        "tips": [
            "Ensure that your body remains in one line throughout this exercise"
        ],
        "references": [],
        "svg": [
            "svg/0090-relaxation.svg",
            "svg/0090-tension.svg"
        ],
        "png": [
            "png/0090-relaxation.png",
            "png/0090-tension.png"
        ]
    },
    {
        "id": "0091",
        "name": "wide-grip-chin-up",
        "title": "Wide Grip Chin Up",
        "primer": "This variation on the basic chin up is a great exercise for people who rock climb",
        "type": "Isolation",
        "primary": [
            "Trapezius"
        ],
        "secondary": [
            "Trapezius",
            "biceps brachii"
        ],
        "equipment": [
            "Body",
            "pull-up bar"
        ],
        "steps": [
            "Grasp a chin up bar with a slightly wider than shoulder width grip",
            "Keeping your body straight pull yourself up & to one side of the bar",
            "Lower your body back down to the starting position",
            "Raise yourself to the other side of the bar",
            "Repeat"
        ],
        "tips": [
            "Ensure to hang dow completely before alternating to the other side"
        ],
        "references": [],
        "svg": [
            "svg/0091-relaxation.svg",
            "svg/0091-tension.svg"
        ],
        "png": [
            "png/0091-relaxation.png",
            "png/0091-tension.png"
        ]
    },
    {
        "id": "0092",
        "name": "straight-arm-push-down",
        "title": "Straight Arm Push Down",
        "primer": "This exercise for strengthening the Lats & also works the Triceps",
        "type": "Isolation",
        "primary": [
            "Latissimus Dorsi"
        ],
        "secondary": [
            "Triceps Brachii"
        ],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Grasp wide grip pull down bar with a wide grip so your h&s are on the portion of the bar which curves down",
            "St& erect with your abs drawn in",
            "Keeping a slight bend in your elbows & your wrist steady pull the bar down from the starting position to your upper thighs",
            "With a controlled motion bring the bar back up to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0092-relaxation.svg",
            "svg/0092-tension.svg"
        ],
        "png": [
            "png/0092-relaxation.png",
            "png/0092-tension.png"
        ]
    },
    {
        "id": "0093",
        "name": "underh&-pull-downs",
        "title": "Pull Down: Underh&",
        "primer": "An exercise for lats & biceps strengthening",
        "type": "Isolation",
        "primary": [
            "Latissimus Dorsi"
        ],
        "secondary": [
            "biceps brachii"
        ],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Sitting upright with your abs drawn in grasp a Pull Down bar with & underh& grip shoulder width apart",
            "Pull the bar down till the bar reaches your upper chest, keeping your elbows close to your body",
            "Slowly return the bar to the starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0093-relaxation.svg",
            "svg/0093-tension.svg"
        ],
        "png": [
            "png/0093-relaxation.png",
            "png/0093-tension.png"
        ]
    },
    {
        "id": "0094",
        "name": "upright-band-rows",
        "title": "Upright Band Rows",
        "primer": "An exercise for lats, triceps & shoulder strengthening",
        "type": "Isolation",
        "primary": [
            "Latissimus Dorsi"
        ],
        "secondary": [
            "Triceps Brachii",
            "Deltoid"
        ],
        "equipment": [
            "Body",
            "exercise band"
        ],
        "steps": [
            "St& on the band so that the h&les are level with your upper thigh",
            "With your back straight & abs drawn in raise your h&s upward to your collarbone",
            "Your elbows & arms should be parallel with the floor",
            "Slowly lower your arms & return to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0094-relaxation.svg",
            "svg/0094-tension.svg"
        ],
        "png": [
            "png/0094-relaxation.png",
            "png/0094-tension.png"
        ]
    },
    {
        "id": "0095",
        "name": "underh&-pull-down",
        "title": "Pull Down: Underh&",
        "primer": "An exercise for lats & biceps strengthening",
        "type": "Isolation",
        "primary": [
            "Latissimus Dorsi"
        ],
        "secondary": [
            "biceps brachii"
        ],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Sitting upright with your abs drawn in grasp a Pull Down bar with & underh& grip shoulder width apart",
            "Pull the bar down till the bar reaches your upper chest, keeping your elbows close to your body",
            "Slowly return the bar to the starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0095-relaxation.svg",
            "svg/0095-tension.svg"
        ],
        "png": [
            "png/0095-relaxation.png",
            "png/0095-tension.png"
        ]
    },
    {
        "id": "0096",
        "name": "v-bar-pull-down",
        "title": "Pull Down: V Bar ",
        "primer": "An exercise for lats, biceps & middle back strengthening",
        "type": "Isolation",
        "primary": [
            "Latissimus Dorsi"
        ],
        "secondary": [
            "biceps brachii"
        ],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Attach a V bar to the pull down pulley of a cable machine",
            "Sitting upright with your abs drawn grasp the bar with an overh& grip, your palms facing in",
            "Pull the bar straight down to your upper chest",
            "Pause for a moment after touching the chest & then slowly return the bar to starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0096-relaxation.svg",
            "svg/0096-tension.svg"
        ],
        "png": [
            "png/0096-relaxation.png",
            "png/0096-tension.png"
        ]
    },
    {
        "id": "0097",
        "name": "wide-grip-lat-pull-down",
        "title": "Pull Down: Wide Bar (Wide Grip)",
        "primer": "An exercise for lats, biceps & middle back strengthening",
        "type": "Isolation",
        "primary": [
            "Latissimus Dorsi"
        ],
        "secondary": [
            "biceps brachii",
            "Latissimus Dorsi"
        ],
        "equipment": [
            "cable",
            "wide bar"
        ],
        "steps": [
            "Sit at a cable pull down machine fitted with a wide bar",
            "Grasp the bar with a wide overh& grip (palms facing forward) ",
            "With your abs drawn in & back straight pull the bar down to your upper chest",
            "Pause for a moment & then return the bar to the starting position",
            "Repeat"
        ],
        "tips": [
            "Ensure you maintain a straight back trough out this exercise"
        ],
        "references": [],
        "svg": [],
        "png": []
    },
    {
        "id": "0098",
        "name": "pullover-stability-ball-weight",
        "title": "Pullover On Stability Ball With Weight",
        "primer": "An exercise for back, shoulders & neck strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "back",
            "Trapezius"
        ],
        "equipment": [
            "exercise ball",
            "Dumbbell"
        ],
        "steps": [
            "Grasp a Barbell or Dumbbell & sit on a Ball with your feet firmly placed on the floor",
            "Lower your body so your upper abs are the only part of your body supported on the Ball",
            "Bring the Barbell or Dumbbell to your chest with your arms extend",
            "In an arcing motion raise the Barbell or Dumbbell over & behind your head towards the floor",
            "Return to starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0098-relaxation.svg",
            "svg/0098-tension.svg"
        ],
        "png": [
            "png/0098-relaxation.png",
            "png/0098-tension.png"
        ]
    },
    {
        "id": "0099",
        "name": "barbell-dead-lifts",
        "title": "Dead Lifts: Barbell",
        "primer": "The techniques is identical to that of the Smith Machine dead lift except for the fact that this exercise provides less support",
        "type": "Isolation",
        "primary": [
            "erector spinae"
        ],
        "secondary": [
            "ischiocrural muscles",
            "gastrocnemius",
            "soleus"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "St& with your feet shoulder width apart so that your feet are under the bar",
            "Keeping your back straight bend at the waist, allow some bend in your knees",
            "Grasp the par with an overh& grip approximately 16 inches apart",
            "Straighten your back as you hold the bar at arm’s length",
            "Bend over again lowering the bar to just above the floor"
        ],
        "tips": [
            "An advanced exercise & should be perfected first with the Smith Machine"
        ],
        "references": [
            "https://youtu.be/iaDC0meiUtw"
        ],
        "svg": [
            "svg/0099-relaxation.svg",
            "svg/0099-tension.svg"
        ],
        "png": [
            "png/0099-relaxation.png",
            "png/0099-tension.png"
        ]
    },
    {
        "id": "0100",
        "name": "smith-machine-dead-lifts",
        "title": "Dead Lifts: Smith Machine",
        "primer": "This is the same as a Dead Lift but the Smith Machine allows for better control of the weight",
        "type": "Isolation",
        "primary": [
            "erector spinae"
        ],
        "secondary": [
            "ischiocrural muscles",
            "gastrocnemius",
            "soleus"
        ],
        "equipment": [
            "Smith Machine"
        ],
        "steps": [
            "St& with your feet shoulder width apart so that your feet are under the bar",
            "Keeping your back straight bend at the waist, allow some bend in your knees",
            "Grasp the par with an overh& grip approximately 16 inches apart",
            "Straighten your back as you hold the bar at arm’s length",
            "Bend over again lowering the bar to just above the floor"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0100-relaxation.svg",
            "svg/0100-tension.svg"
        ],
        "png": [
            "png/0100-relaxation.png",
            "png/0100-tension.png"
        ]
    },
    {
        "id": "0101",
        "name": "barbell-good-mornings",
        "title": "Good Mornings: Barbell",
        "primer": "This is one of the oldest exercises in bodybuilding but it still is one of the best for working the lower back",
        "type": "Isolation",
        "primary": [
            "erector spinae"
        ],
        "secondary": [
            "ischiocrural muscles"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Place a barbell across your shoulders",
            "Keeping your head up & your back completely straight, bend at the waist until your back is parallel with the floor",
            "Return to starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0101-relaxation.svg",
            "svg/0101-tension.svg"
        ],
        "png": [
            "png/0101-relaxation.png",
            "png/0101-tension.png"
        ]
    },
    {
        "id": "0102",
        "name": "smith-machine-good-mornings",
        "title": "Good Mornings: Smith Machine",
        "primer": "This exercise utilises the same technique of the st&ard Good Mornings yet the use of the Smith Machine provides more stability",
        "type": "Isolation",
        "primary": [
            "erector spinae"
        ],
        "secondary": [
            "ischiocrural muscles"
        ],
        "equipment": [
            "Smith Machine"
        ],
        "steps": [
            "Place a barbell across your shoulders",
            "Keeping your head up & your back completely straight, bend at the waist until your back is parallel with the floor",
            "Return to starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0102-relaxation.svg",
            "svg/0102-tension.svg"
        ],
        "png": [
            "png/0102-relaxation.png",
            "png/0102-tension.png"
        ]
    },
    {
        "id": "0103",
        "name": "hyperextensions",
        "title": "Hyperextensions",
        "primer": "This exercise not only adds strength but also flexibility to the back & core muscles",
        "type": "Isolation",
        "primary": [
            "erector spinae"
        ],
        "secondary": [
            "ischiocrural muscles",
            "core"
        ],
        "equipment": [
            "bench: hyperextension"
        ],
        "steps": [
            "Adjust the hyperextension bench so that your ankles are tucked under the footpads & your thighs are flat across the top pad",
            "With your arms folded across your chest & your back straight, slowly bend at the waist towards the floor, keeping your back flat",
            "Slowly return to the starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0103-relaxation.svg",
            "svg/0103-tension.svg"
        ],
        "png": [
            "png/0103-relaxation.png",
            "png/0103-tension.png"
        ]
    },
    {
        "id": "0104",
        "name": "back-extension-stability-ball",
        "title": "Back Extension on Stability Ball",
        "primer": "This exercise provides flexibility as it strengthens the muscles of the back & core",
        "type": "Isolation",
        "primary": [
            "erector spinae"
        ],
        "secondary": [
            "core",
            "ischiocrural muscles"
        ],
        "equipment": [
            "exercise ball"
        ],
        "steps": [
            "Lie prone (on your stomach) on a Stability Ball with your toes firmly planted on the floor for balance",
            "With your h&s across your chest or at your ears, raise your chest off the ball so you are hyperextending your spine",
            "Slowly return your chest to the ball",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0104-relaxation.svg",
            "svg/0104-tension.svg"
        ],
        "png": [
            "png/0104-relaxation.png",
            "png/0104-tension.png"
        ]
    },
    {
        "id": "0105",
        "name": "supermans",
        "title": "Supermans",
        "primer": "An excellent exercise & a stretch for the lower back & core muscles",
        "type": "Isolation",
        "primary": [
            "erector spinae"
        ],
        "secondary": [
            "core"
        ],
        "equipment": [
            "Body"
        ],
        "steps": [
            "Lie flat on your stomach with your arms stretched out in front of you",
            "Raise your arms & legs off the floor & hold this position for 2 seconds",
            "Return to the starting position on the floor",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0105-relaxation.svg",
            "svg/0105-tension.svg"
        ],
        "png": [
            "png/0105-relaxation.png",
            "png/0105-tension.png"
        ]
    },
    {
        "id": "0107",
        "name": "dumbbell-dead-lifts",
        "title": "Dead Lifts: Dumbbell",
        "primer": "An exercise for lower back, hamstring & calves strengthening",
        "type": "Isolation",
        "primary": [
            "erector spinae"
        ],
        "secondary": [
            "gastrocnemius",
            "soleus",
            "ischiocrural muscles"
        ],
        "equipment": [
            "Dumbbells"
        ],
        "steps": [
            "Grasp 2 dumbbells & st& with your feet shoulder width apart",
            "Keeping your back straight bend at the waist, allow some bend in your knees",
            "Grasp the dumbbells with an overh& grip in each h&",
            "Straighten your back as you hold the dumbbells at arm’s length",
            "Bend over again lowering the dumbbells to just above the floor",
            "Return to starting position",
            "Repeat"
        ],
        "tips": [
            "Do not increase the weight on this exercise until you have mastered the correct form"
        ],
        "references": [],
        "svg": [
            "svg/0107-relaxation.svg",
            "svg/0107-tension.svg"
        ],
        "png": [
            "png/0107-relaxation.png",
            "png/0107-tension.png"
        ]
    },
    {
        "id": "0109",
        "name": "bridging",
        "title": "Bridging",
        "primer": "An excellent exercise for strengthening & maintaining the core muscles",
        "type": "Isolation",
        "primary": [
            "glutaeus maximus"
        ],
        "secondary": [
            "core"
        ],
        "equipment": [
            "Body"
        ],
        "steps": [
            "Lie on your back with your knees bent & your feet flat on the floor",
            "Lift up hips & bum off the floor as you draw your abs in & keep your gluts tight"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0109-relaxation.svg",
            "svg/0109-tension.svg"
        ],
        "png": [
            "png/0109-relaxation.png",
            "png/0109-tension.png"
        ]
    },
    {
        "id": "0111",
        "name": "body-leg-lifts",
        "title": "Body Leg Lifts",
        "primer": "An exercise for gluts & hamstring strengthening",
        "type": "Isolation",
        "primary": [
            "glutaeus maximus"
        ],
        "secondary": [
            "ischiocrural muscles"
        ],
        "equipment": [
            "Body"
        ],
        "steps": [
            "Using a post or tall weight bench for balance st& straight with your abs drawn in",
            "Raise one off the ground & behind you while st&ing on the other leg",
            "Slowly lower the leg & raise it again while flexing the gluts",
            "Repeat with your other leg"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0111-relaxation.svg",
            "svg/0111-tension.svg"
        ],
        "png": [
            "png/0111-relaxation.png",
            "png/0111-tension.png"
        ]
    },
    {
        "id": "0112",
        "name": "one-legged-cable-kickback",
        "title": "One Legged Cable Kickback",
        "primer": "An exercise for gluts & hamstring strengthening",
        "type": "Isolation",
        "primary": [
            "glutaeus maximus"
        ],
        "secondary": [
            "ischiocrural muscles"
        ],
        "equipment": [
            "cable"
        ],
        "steps": [
            "St&ing at a cable tower attach an ankle cuff to a low pulley",
            "Facing the weight stack, with a slight bend in your knees & your abs drawn in",
            "Slowly kick your ankle back in & arc as high as you are able to",
            "Return to starting position & switch ankles"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0112-relaxation.svg",
            "svg/0112-tension.svg"
        ],
        "png": [
            "png/0112-relaxation.png",
            "png/0112-tension.png"
        ]
    },
    {
        "id": "0113",
        "name": "side-plank",
        "title": "Side Plank",
        "primer": "An exercise for core strengthening",
        "type": "Isolation",
        "primary": [
            "obliques"
        ],
        "secondary": [],
        "equipment": [
            "Body"
        ],
        "steps": [
            "Lay on one side of your body with your legs straight & your forearm perpendicular to your body in front of you",
            "Drawing your abs in, slowly raise yourself up so you are balanced on your feet & your forearm",
            "Hold this position & slowly return back to the starting position",
            "Repeat on other side"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0113-relaxation.svg",
            "svg/0113-tension.svg"
        ],
        "png": [
            "png/0113-relaxation.png",
            "png/0113-tension.png"
        ]
    },
    {
        "id": "0114",
        "name": "barbell-lunges",
        "title": "Lunges: Barbell",
        "primer": "This is a classic exercise used for strengthening the hamstrings, quadriceps, calves & gluts",
        "type": "Isolation",
        "primary": [
            "ischiocrural muscles"
        ],
        "secondary": [
            "glutaeus maximus",
            "quadriceps",
            "gastrocnemius",
            "soleus"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Start by placing a barbell across your upper back, using a grip slightly wider than your shoulders",
            "St& with your feet about 8 inches apart, toes facing forward",
            "Take a step forward (2-3 feet) keeping your abs drawn in & your upper body straight",
            "Slowly lower one knee down as if kneeling while keeping your other knee bent at a 90 degree angle, do not let your knee touch the ground",
            "Lower your body so that your rear knee is just above the floor & hold for a moment before returning to the starting position",
            "Repeat on other side"
        ],
        "tips": [
            "Your front knee should never go past the toes of that foot & should remain at a 90 degree angle in order, to prevent knee injury"
        ],
        "references": [],
        "svg": [
            "svg/0114-relaxation.svg",
            "svg/0114-tension.svg"
        ],
        "png": [
            "png/0114-relaxation.png",
            "png/0114-tension.png"
        ]
    },
    {
        "id": "0115",
        "name": "dumbbell-lunges",
        "title": "Lunges: Dumbbell",
        "primer": "An exercise for whole leg but mainly hamstring strengthening",
        "type": "Isolation",
        "primary": [
            "ischiocrural muscles"
        ],
        "secondary": [
            "glutaeus maximus",
            "quadriceps",
            "gastrocnemius",
            "soleus"
        ],
        "equipment": [
            "Dumbbells"
        ],
        "steps": [
            "Grasp a dumbbell in each h&",
            "St& with your feet about 8 inches apart, toes facing forward",
            "Take a step forward (2-3 feet) keeping your abs drawn in & your upper body straight",
            "Slowly lower one knee down as if kneeling while keeping your other knee bent at a 90 degree angle, do not let your knee touch the ground",
            "Lower your body so that the rear knee is just above the floor & hold for a moment before returning to the starting position",
            "Repeat on opposite side"
        ],
        "tips": [
            "Ensure not maintain your front knee at a 90 degree angle, in order to prevent knee injury"
        ],
        "references": [],
        "svg": [
            "svg/0115-relaxation.svg",
            "svg/0115-tension.svg"
        ],
        "png": [
            "png/0115-relaxation.png",
            "png/0115-tension.png"
        ]
    },
    {
        "id": "0116",
        "name": "flutter-kicks",
        "title": "Flutter Kicks",
        "primer": "An exercise for quadriceps & hamstring strengthening",
        "type": "Isolation",
        "primary": [
            "ischiocrural muscles"
        ],
        "secondary": [
            "quadriceps"
        ],
        "equipment": [
            "flat bench"
        ],
        "steps": [
            "Lie face down on a bench with your hips on the edge, hold onto the bench with your h&s",
            "Allow your legs & toes hang down",
            "Draw your abs in, squeeze your gluts & hamstrings",
            "Kick each back & up while keeping your hips on the bench",
            "Alternate kicking each leg"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0116-relaxation.svg",
            "svg/0116-tension.svg"
        ],
        "png": [
            "png/0116-relaxation.png",
            "png/0116-tension.png"
        ]
    },
    {
        "id": "0117",
        "name": "lying-leg-curl-machine",
        "title": "Lying Leg Curl Machine",
        "primer": "An exercise for hamstring strengthening",
        "type": "Isolation",
        "primary": [
            "ischiocrural muscles"
        ],
        "secondary": [],
        "equipment": [
            "machine"
        ],
        "steps": [
            "Lie face down on a leg curl machine & place your heels under the roller pad",
            "Grasp the grips with your h&s for support & slowly curl your ankles up towards your back",
            "Hold for a moment & then return to starting position",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0117-relaxation.svg",
            "svg/0117-tension.svg"
        ],
        "png": [
            "png/0117-relaxation.png",
            "png/0117-tension.png"
        ]
    },
    {
        "id": "0118",
        "name": "romanian-dead-lift",
        "title": "Romanian Dead Lift",
        "primer": "An exercise similar to the regular dead lift & strengthens the hamstring, calves, quadriceps & gluts",
        "type": "Isolation",
        "primary": [
            "ischiocrural muscles"
        ],
        "secondary": [
            "gastrocnemius",
            "soleus",
            "quadriceps",
            "glutaeus maximus"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Place a barbell in front of your feet on the ground",
            "Grasp the barbell with a grip a bit wider than shoulder width apart",
            "Bend your knees slightly, keeping your hips & back straight",
            "Lift the bar straight up concentrating on using your hips as you st&",
            "St& with the bar resting against your thighs",
            "Lower the bar to the floor with a slight bend in your knees flexing your hips back for stability"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0118-relaxation.svg",
            "svg/0118-tension.svg"
        ],
        "png": [
            "png/0118-relaxation.png",
            "png/0118-tension.png"
        ]
    },
    {
        "id": "0119",
        "name": "seated-leg-curl",
        "title": "Seated Leg Curl",
        "primer": "An exercise for hamstring strengthening which is similar to the laying leg curls",
        "type": "Isolation",
        "primary": [
            "ischiocrural muscles"
        ],
        "secondary": [],
        "equipment": [
            "machine"
        ],
        "steps": [
            "Adjust the machine so that the footpad is just above your heels",
            "Sit upright with your abs drawn in & your legs in front of you",
            "Slowly curl your legs back towards you & hold for a moment",
            "With controlled movement return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0119-relaxation.svg",
            "svg/0119-tension.svg"
        ],
        "png": [
            "png/0119-relaxation.png",
            "png/0119-tension.png"
        ]
    },
    {
        "id": "0120",
        "name": "st&ing-leg-curls",
        "title": "St&ing Leg Curls",
        "primer": "An exercise for hamstring strengthening",
        "type": "Isolation",
        "primary": [
            "ischiocrural muscles"
        ],
        "secondary": [],
        "equipment": [
            "machine"
        ],
        "steps": [
            "St&ing at a leg curl machine adjust the rear footpad so it is just above your ankle",
            "Grasp the h&les of the machine for support & draw your abs in",
            "Raise your foot up towards your back slowly",
            "Return to the starting position & chance legs"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0120-relaxation.svg",
            "svg/0120-tension.svg"
        ],
        "png": [
            "png/0120-relaxation.png",
            "png/0120-tension.png"
        ]
    },
    {
        "id": "0121",
        "name": "walking-lunges",
        "title": "Lunges: Dumbbell (Walking)",
        "primer": "A walking lunge gives you the benefit of lunges plus core muscle training from the constant motion",
        "type": "Isolation",
        "primary": [
            "ischiocrural muscles"
        ],
        "secondary": [
            "quadriceps",
            "glutaeus maximus",
            "gastrocnemius",
            "soleus"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Start by grasping a dumbbell in each h&",
            "St& with your feet about 8 inches apart, toes facing forward",
            "Take a lunge forward keeping your abs drawn in & your upper body straight",
            "Slowly lower one knee down as if kneeling while keeping your other knee bent at a 90 degree angle, do not let your knee touch the ground",
            "Lower your body to just above the floor & hold for a moment before pushing off with the back foot",
            "Step through & repeat the exercise with the other leg"
        ],
        "tips": [
            "Practice the walking lunge without any weights until you are comfortable with the movements"
        ],
        "references": [],
        "svg": [
            "svg/0121-relaxation.svg",
            "svg/0121-tension.svg"
        ],
        "png": [
            "png/0121-relaxation.png",
            "png/0121-tension.png"
        ]
    },
    {
        "id": "0122",
        "name": "barbell-squat",
        "title": "Barbell Squat",
        "primer": "",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "ischiocrural muscles"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "An exercise for leg strengthening, mainly the quadriceps",
            "Lifting a barbell off of a weight rack, position it on your shoulders",
            "Place your feet slightly wider than shoulder width apart with your knees & toes pointed slightly outward",
            "Drawing your abs in descend slowly by bending at the knees & hips as if you are sitting down (squatting)",
            "Lower yourself as far as you can control without letting your body shift towards your toes (this will cause you to loose balance)",
            "Pause in the downward position & slowly return upright to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0122-relaxation.svg",
            "svg/0122-tension.svg"
        ],
        "png": [
            "png/0122-relaxation.png",
            "png/0122-tension.png"
        ]
    },
    {
        "id": "0123",
        "name": "hack-squat-machine",
        "title": "Hack Squat: Machine",
        "primer": "This exercise is a variation of the Squat which uses a machine",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "ischiocrural muscles",
            "gastrocnemius",
            "soleus"
        ],
        "equipment": [
            "machine"
        ],
        "steps": [
            "This exercise is a variation of the Squat which uses a machine.  This exercise may be preferred by beginners",
            "Lie face up on a Hack Squat machine with your shoulders against the pad",
            "Place your feet facing forward at slightly less than shoulder width apart with your toes point slightly outward",
            "Release the dock levers & place your h&s on the h& grips",
            "Drawing your abs in, extend your body st&ing upright",
            "Lower your body to a squatting position so you knees are bent as if you were sitting down",
            "Return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0123-relaxation.svg",
            "svg/0123-tension.svg"
        ],
        "png": [
            "png/0123-relaxation.png",
            "png/0123-tension.png"
        ]
    },
    {
        "id": "0124",
        "name": "smith-machine-squats",
        "title": "Squats: Smith Machine",
        "primer": "This exercise is a variation of a squat using the Smith Machine",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "gastrocnemius",
            "soleus",
            "glutaeus maximus",
            "ischiocrural muscles"
        ],
        "equipment": [
            "Smith Machine"
        ],
        "steps": [
            "This exercise uses the Smith Machine to work the Quadriceps, Hamstrings, Calves & Glutes. A great overall exercise for the lower body. There are many variations on the squat, this is the original version using a Smith Machine for better flow of movement",
            "Set the height of the barbell to shoulder height",
            "Place your feet slightly wider than shoulder width apart with your knees & toes pointed slightly outward",
            "Drawing your abs in descend slowly by bending at the knees & hips as if you are sitting down (squatting)",
            "Lower yourself as far as you can control without letting your body shift over your toes (this will cause you to loose balance)",
            "Pause in the downward squatting position & slowly return upright to the starting position",
            "If needed, a pad on the bar or towel on your shoulders can help improve your grip & the reduce the discomfort of the bar against your back. First practice the squat without any weight to allow yourself to become comfortable with the movements"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0124-relaxation.svg",
            "svg/0124-tension.svg"
        ],
        "png": [
            "png/0124-relaxation.png",
            "png/0124-tension.png"
        ]
    },
    {
        "id": "0125",
        "name": "hack-squat-with-barbell",
        "title": "Hack Squat: Barbell",
        "primer": "Another variation of the basic Squat that focuses primarily on the quadriceps or thigh muscles",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "ischiocrural muscles"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Another variation of the basic Squat that focuses primarily on the quadriceps or thigh muscles",
            "Place the barbell on the floor just behind your legs & st& with your feet shoulder width apart with your toes pointing forward",
            "With your feet firmly placed on the floor, reach down & grasp the barbell from behind with an overh& grip",
            "Lift the barbell by extending your hips & knees, taking care not to lock your knees",
            "Lower yourself (squat) down until your thighs are parallel to the floor",
            "Slowly raise yourself up to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0125-relaxation.svg",
            "svg/0125-tension.svg"
        ],
        "png": [
            "png/0125-relaxation.png",
            "png/0125-tension.png"
        ]
    },
    {
        "id": "0126",
        "name": "smith-machine-hack-squat",
        "title": "Smith Machine Hack Squat",
        "primer": "Another variation of the basic Squat that focuses primarily on the quadriceps, or thigh muscles, while using the Smith Machine",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "ischiocrural muscles",
            "glutaeus maximus"
        ],
        "equipment": [
            "Smith Machine"
        ],
        "steps": [
            "Another variation of the basic Squat that focuses primarily on the quadriceps, or thigh muscles, while using the Smith Machine",
            "Adjust the bar to a low setting just above your ankles",
            "St& with the bar on the floor just behind your legs, with your feet shoulder width apart & your toes pointing forward",
            "With your feet firmly placed on the floor reach down & grasp the bar from behind, with an overh& grip",
            "Lift the bar by extending your hips & knees, taking care not to lock your knees",
            "Lower yourself (squat) down until your thighs are parallel to the floor",
            "Slowly raise yourself up to starting position",
            "Note: Your knees should be moving in the same direction as your feet"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0126-relaxation.svg",
            "svg/0126-tension.svg"
        ],
        "png": [
            "png/0126-relaxation.png",
            "png/0126-tension.png"
        ]
    },
    {
        "id": "0127",
        "name": "leg-press",
        "title": "Leg Press",
        "primer": "This exercise is crucial for building & strengthening the legs",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "gastrocnemius",
            "soleus",
            "ischiocrural muscles"
        ],
        "equipment": [
            "machine"
        ],
        "steps": [
            "Along with the Squat, this exercise is crucial for building & strengthening the legs",
            "Adjust the seat of the machine so that your feet comfortably reach the crosspiece with a slight bend in your knees",
            "To begin, press your feet forward at a shoulder width stance & release the safety locks",
            "Slowly lower the weight towards your body, keeping your abs drawn in & your knees moving in the same direction as your feet to a 90 degree angle",
            "Do not lock your knees or bounce the weight"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0127-relaxation.svg",
            "svg/0127-tension.svg"
        ],
        "png": [
            "png/0127-relaxation.png",
            "png/0127-tension.png"
        ]
    },
    {
        "id": "0128",
        "name": "rear-lunges-with-barbell",
        "title": "Lunges: Barbell (Rear)",
        "primer": "An advanced version of a lunge",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "hip abductors",
            "gastrocnemius",
            "soleus",
            "glutaeus maximus",
            "ischiocrural muscles"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Place a barbell on a rack at chest height",
            "Lift the barbell of of the rack & onto your shoulders, gripping the bar slightly wider than shoulder width apart",
            "St& with your feet approximately 8 inches apart with your toes pointing forward",
            "Slowly take a step backward with your right leg",
            "Keeping your abs drawn in & your upper body straight, lower your body until your left knee is almost on the ground. You may choose to place a mat or towel under your knee",
            "Hold for a moment & then return to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0128-relaxation.svg",
            "svg/0128-tension.svg"
        ],
        "png": [
            "png/0128-relaxation.png",
            "png/0128-tension.png"
        ]
    },
    {
        "id": "0129",
        "name": "rear-lunges-with-dumbbell",
        "title": "Lunges: Dumbbell (Rear)",
        "primer": "An advanced version of a lunge using a dumbbell",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "gastrocnemius",
            "soleus",
            "ischiocrural muscles",
            "glutaeus maximus",
            "hip abductors"
        ],
        "equipment": [
            "Dumbbells"
        ],
        "steps": [
            "An advanced version of a lunge",
            "Grasp a dumbbell in each h&",
            "St& with your feet approximately 8 inches apart with your toes pointing forward",
            "Slowly take a step backward with your right leg",
            "Keeping your abs drawn in & your upper body straight, lower your body until your left knee is almost on the ground. You may choose to place a mat or towel under your knee",
            "Hold for a moment & then return to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0129-relaxation.svg",
            "svg/0129-tension.svg"
        ],
        "png": [
            "png/0129-relaxation.png",
            "png/0129-tension.png"
        ]
    },
    {
        "id": "0130",
        "name": "squats-using-dumbbells",
        "title": "Squats: Dumbbells",
        "primer": "This is a great overall exercise for the lower body that uses dumbbells",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "ischiocrural muscles",
            "gastrocnemius",
            "soleus"
        ],
        "equipment": [
            "Dumbbells"
        ],
        "steps": [
            "This is a great overall exercise for the lower body that uses dumbbells instead of a barbell. Beginners may find this version easier to perform",
            "Grasp a dumbbell in each h&",
            "St& with feet slightly wider than shoulder width apart with your knees & toes pointed slightly outward",
            "Drawing your abs in descend slowly by bending at the knees & hips as if you are sitting down (squatting)",
            "Lower yourself as far as you can control without letting your body shift towards your toes (this will cause you to loose balance)",
            "Pause in the downward position & slowly return upright to the starting position",
            "Note: Practicing the squat without any weight will allow you to become comfortable with the movements"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0130-relaxation.svg",
            "svg/0130-tension.svg"
        ],
        "png": [
            "png/0130-relaxation.png",
            "png/0130-tension.png"
        ]
    },
    {
        "id": "0131",
        "name": "side-squats-with-barbell",
        "title": "Side Squats: Barbell",
        "primer": "This version of a squat works the hip adductors, helping build better core strength & coordination",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "hip abductors",
            "ischiocrural muscles"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Place a barbell on your shoulders & grasp it with a wide grip",
            "St& with your feet wide apart, with the foot of the leg you will be leaning towards angled out",
            "Bring your lower body to your foot by bending the hip & knee of your lead leg, & keeping your other leg fairly straight",
            "Return to the starting position & switch legs"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0131-relaxation.svg",
            "svg/0131-tension.svg"
        ],
        "png": [
            "png/0131-relaxation.png",
            "png/0131-tension.png"
        ]
    },
    {
        "id": "0132",
        "name": "single-leg-squat-with-barbell",
        "title": "Single Leg Squat with Barbell",
        "primer": "An advanced exercise & modification of the basic squat",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "gastrocnemius",
            "soleus",
            "ischiocrural muscles"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "An advanced exercise & modification of the basic squat. Mastery of the squat is recommended before attempting this exercise",
            "Place a barbell on your back, above your shoulders with a wide grip",
            "Cross the lower leg above the knee of your supporting leg (the leg you will squat with)",
            "Squat down as low as you are able",
            "Slowly return to an upright position by straightening your hip & knee",
            "Switch legs & repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0132-relaxation.svg",
            "svg/0132-tension.svg"
        ],
        "png": [
            "png/0132-relaxation.png",
            "png/0132-tension.png"
        ]
    },
    {
        "id": "0133",
        "name": "squat-to-bench-with-barbell",
        "title": "Squats: Barbell (to Bench)",
        "primer": "This variation on a squat uses a bench to remind you how far down to squat",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "glutaeus maximus",
            "gastrocnemius",
            "soleus",
            "ischiocrural muscles"
        ],
        "equipment": [
            "Barbell",
            "Bench"
        ],
        "steps": [
            "This is s great overall exercise for the lower body. There are many variations on the squat, this one uses a bench to remind you how far down to squat",
            "Place a bench behind you",
            "Lifting a barbell off of a weight rack, position it on your shoulders",
            "Place your feet slightly wider than shoulder width apart with your knees & toes pointed slightly outward",
            "Drawing your abs in, descend slowly & squat down, bending at the knees & hips",
            "Lower yourself as far as you can control without letting your body shift towards your toes (this will cause you to loose balance). Do not sit on the bench",
            "Pause in the downward position & slowly return upright to the starting position",
            "A pad on the bar or towel on your shoulders can help improve your grip & reduce discomfort of the bar against your back. Practice the squat without any weight to allow yourself to become comfortable with the movements. Do not sit on the bench during the exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0133-relaxation.svg",
            "svg/0133-tension.svg"
        ],
        "png": [
            "png/0133-relaxation.png",
            "png/0133-tension.png"
        ]
    },
    {
        "id": "0134",
        "name": "step-ups-with-barbell",
        "title": "Step Ups: Barbell",
        "primer": "This exercise builds coordination as well as muscle",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "ischiocrural muscles",
            "gastrocnemius",
            "soleus"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Place a bench, box or step in front of you",
            "Grasp a barbell with a wide grip & place it across your shoulders",
            "With your left leg, step up on the bench, & follow by stepping up with your right leg",
            "Step down with your left leg & then your right leg",
            "Repeat starting with your right leg",
            "Note: Use a lighter weight until you are used to the motion of this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0134-relaxation.svg",
            "svg/0134-tension.svg"
        ],
        "png": [
            "png/0134-relaxation.png",
            "png/0134-tension.png"
        ]
    },
    {
        "id": "0135",
        "name": "hip-adduction",
        "title": "Hip Adduction",
        "primer": "This exercises strengthens hip flexors & muscles of the thighs",
        "type": "Isolation",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "hip abductors"
        ],
        "equipment": [
            "cable"
        ],
        "steps": [
            "St& alongside a cable pulley stack & attach a cuff to the pulley & your ankle",
            "Step away from the stack, holding onto the stack for support",
            "St&ing firm on the foot not attached to the cable & slowly abduct, or pull, your cuffed ankle in front of your stabilizing leg",
            "Repeat & switch ankles"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0135-relaxation.svg",
            "svg/0135-tension.svg"
        ],
        "png": [
            "png/0135-relaxation.png",
            "png/0135-tension.png"
        ]
    },
    {
        "id": "0136",
        "name": "squat-to-bench-with-dumbbells",
        "title": "Squats: Dumbbells (to Bench)",
        "primer": "This variation of a squat uses a bench to remind you how far down to squat",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "gastrocnemius",
            "soleus",
            "ischiocrural muscles",
            "glutaeus maximus"
        ],
        "equipment": [
            "Dumbbell",
            "Bench"
        ],
        "steps": [
            "This is a great overall exercise for the lower body. There are many variations on the squat, this one uses a bench to remind you how far down to squat",
            "Place a bench behind you",
            "Grasp a dumbbell in each h&",
            "Place your feet slightly wider than shoulder width apart with your knees & toes pointed slightly outward",
            "Drawing your abs in descend slowly by squatting down & bending at the knees & hips",
            "Lower yourself as far as you can control without letting your body shift towards your toes (this will cause you to loose balance)",
            "Pause in the downward position & slowly return upright to the starting position",
            "Practice the squat without any weight to allow yourself to become comfortable with the movements. Do not sit on the bench during the exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0136-relaxation.svg",
            "svg/0136-tension.svg"
        ],
        "png": [
            "png/0136-relaxation.png",
            "png/0136-tension.png"
        ]
    },
    {
        "id": "0137",
        "name": "step-ups-with-dumbbells",
        "title": "Step Ups: Dumbbell",
        "primer": "This exercise builds coordination as well as muscle",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "gastrocnemius",
            "soleus",
            "ischiocrural muscles"
        ],
        "equipment": [
            "Dumbbells"
        ],
        "steps": [
            "Place a bench, box or step in front of you",
            "Grasp a dumbbell in each h&",
            "With your left leg, step up on the bench, & follow by stepping up with your right leg",
            "Step down with your left leg & then your right leg",
            "Repeat starting with your right leg",
            "Note: Use a lighter weight until you are used to the motion of this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0137-relaxation.svg",
            "svg/0137-tension.svg"
        ],
        "png": [
            "png/0137-relaxation.png",
            "png/0137-tension.png"
        ]
    },
    {
        "id": "0138",
        "name": "front-squat-with-barbell",
        "title": "Front Squat with Barbell",
        "primer": "The Front Squat works the same muscles as the rear squat without placing the weight of the bar on your shoulders",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "ischiocrural muscles",
            "gastrocnemius",
            "soleus"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "The Front Squat works the same muscles as the rear squat without placing the weight of the bar on your shoulders. This exercise can be a good substitute for people with back & neck injuries",
            "Place the barbell on your upper chest, resting it across your front deltoids & holding it with your arms crossed securely",
            "Keep your head & back straight, abs drawn in & toes pointing slightly outward",
            "Slowly “squat” down so your upper thighs are parallel to the floor",
            "Slowly return to the starting position",
            "Note: Practice the squat without any weight to allow yourself to become comfortable with the movements"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0138-relaxation.svg",
            "svg/0138-tension.svg"
        ],
        "png": [
            "png/0138-relaxation.png",
            "png/0138-tension.png"
        ]
    },
    {
        "id": "0139",
        "name": "front-squat-to-bench-with-barbells",
        "title": "Front Squat to Bench with Barbells",
        "primer": "The Front Squat works the same muscles as the rear squat without placing the weight of the bar on your shoulders",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "ischiocrural muscles",
            "gastrocnemius",
            "soleus"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "The Front Squat works the same muscles as the rear squat without placing the weight of the bar on your shoulders. This exercise can be a good substitute for people with back & neck injuries. By using a bench you remind yourself how far to squat down",
            "Steps",
            "Place a bench behind you",
            "Place the barbell on your upper chest, resting it across your front deltoids & holding it with your arms crossed securely",
            "Keep your head & back straight, abs drawn in & your toes pointing slightly outward",
            "Slowly “squat” down so your upper thighs are parallel to the floor",
            "Slowly return to the starting position",
            "Note: Practice the squat without any weight to allow yourself to become comfortable with the movements. Do not sit on the bench during the exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0139-relaxation.svg",
            "svg/0139-tension.svg"
        ],
        "png": [
            "png/0139-relaxation.png",
            "png/0139-tension.png"
        ]
    },
    {
        "id": "0140",
        "name": "iron-cross-with-dumbbells",
        "title": "Iron Cross: Dumbbell",
        "primer": "An advanced exercise that works the whole body",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "Trapezius",
            "glutaeus maximus",
            "Deltoid",
            "erector spinae",
            "ischiocrural muscles"
        ],
        "equipment": [
            "Dumbbells"
        ],
        "steps": [
            "With a dumbbell in each h&, st& in a low squat stance, your feet shoulder width arms held out in front of you with your palms facing in",
            "St&ing upright, move your arms out & away from your body forming a “T” or “cross”",
            "Note: Do this exercise with light weights until you are comfortable with the movements"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0140-relaxation.svg",
            "svg/0140-tension.svg"
        ],
        "png": [
            "png/0140-relaxation.png",
            "png/0140-tension.png"
        ]
    },
    {
        "id": "0141",
        "name": "jefferson-squats-with-barbell",
        "title": "Jefferson Squats: Barbell",
        "primer": "This exercise builds & shapes the inner thighs",
        "type": "Compound",
        "primary": [
            "ischiocrural muscles"
        ],
        "secondary": [],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "This is a rarely used exercise which is without question one of the best exercises for building & shaping the inner thighs",
            "Place a barbell between your legs so it is perpendicular to your feet",
            "Grasp the barbell with one h& in front of you & one h& behind you with an overh& grip",
            "Squatting down so your thighs are parallel to the floor slowly lift the weight up between your legs as you st&",
            "Slowly return to a starting position just above the floor"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0141-relaxation.svg",
            "svg/0141-tension.svg"
        ],
        "png": [
            "png/0141-relaxation.png",
            "png/0141-tension.png"
        ]
    },
    {
        "id": "0142",
        "name": "leg-extensions",
        "title": "Leg Extensions",
        "primer": "This exercise is a staple for building strong legs",
        "type": "Isolation",
        "primary": [
            "quadriceps"
        ],
        "secondary": [],
        "equipment": [
            "machine"
        ],
        "steps": [
            "Adjust the seat so that your knees have full range of motion & that the footpad fits over your legs, just above your ankles",
            "Grasp the h&les with your h&s for support, keeping your hip & back against the bench",
            "Slowly extend your legs until your knees are straight, but do not lock your knees",
            "Hold for a moment & then with controlled movements return to the starting position",
            "Note: Use controlled movements for this exercise, do not swing the weight up"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0142-relaxation.svg",
            "svg/0142-tension.svg"
        ],
        "png": [
            "png/0142-relaxation.png",
            "png/0142-tension.png"
        ]
    },
    {
        "id": "0143",
        "name": "narrow-stance-leg-press",
        "title": "Narrow Stance Leg Press",
        "primer": "This is a variation of the leg press which targets more of the external muscles of the legs",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "gastrocnemius",
            "soleus",
            "ischiocrural muscles"
        ],
        "equipment": [
            "machine"
        ],
        "steps": [
            "This is a variation of the leg press which targets more of the external muscles of the legs by moving your feet closer together",
            "Sit on a leg press machine with your feet on the crosspiece 6 inches apart, with your toes pointed slightly outward",
            "Grasp the h&les on the side of the machine & release the locks",
            "Keeping your abs drawn in, bend your knees & bring the weight as far as possible towards your chest",
            "Hold this position for a moment & then slowly return the weight to starting position",
            "Note: Do not lock your knees at the top"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0143-relaxation.svg",
            "svg/0143-tension.svg"
        ],
        "png": [
            "png/0143-relaxation.png",
            "png/0143-tension.png"
        ]
    },
    {
        "id": "0144",
        "name": "lying-squat",
        "title": "Lying Squat",
        "primer": "This exercise is similar to a Leg Press Machine working the same muscles",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "gastrocnemius",
            "soleus",
            "ischiocrural muscles"
        ],
        "equipment": [
            "machine"
        ],
        "steps": [
            "Adjust the shoulder rack of the machine so that your feet comfortably reach the crosspiece with a slight bend in your knees",
            "To begin, press your feet forward & release the safety locks",
            "Slowly lower the weight towards your body, keeping your abs drawn in & your knees moving in the same direction as your feet to a 90 degree angle",
            "Do not lock your knees or bounce the weight"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0144-relaxation.svg",
            "svg/0144-tension.svg"
        ],
        "png": [
            "png/0144-relaxation.png",
            "png/0144-tension.png"
        ]
    },
    {
        "id": "0145",
        "name": "narrow-stance-hack-squats",
        "title": "Narrow Stance Hack Squats",
        "primer": "Like the Hack Squat, this exercise works the muscles of the leg",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "ischiocrural muscles",
            "gastrocnemius",
            "soleus"
        ],
        "equipment": [
            "machine"
        ],
        "steps": [
            "Like the Hack Squat, this exercise works the muscles of the leg. The narrow stance targets the external muscles more efficiently",
            "Lie face up on a Hack Squat machine with your shoulders against the pad",
            "Place your feet facing forward at a distance of 6 inches apart with your toes point slightly outward",
            "Release the dock levers & place your h&s on the h&grips",
            "Drawing your abs in, extend your body st&ing upright",
            "Lower your body to a squatting position so your knees are bent as if you were sitting down",
            "Return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0145-relaxation.svg",
            "svg/0145-tension.svg"
        ],
        "png": [
            "png/0145-relaxation.png",
            "png/0145-tension.png"
        ]
    },
    {
        "id": "0146",
        "name": "narrow-stance-squat-with-barbell",
        "title": "Narrow Stance Squat with Barbell",
        "primer": "This version of the Squat targets & defines more of the externals leg muscles",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "glutaeus maximus",
            "gastrocnemius",
            "soleus",
            "ischiocrural muscles"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "A great overall exercise for the lower body. This version of the Squat targets & defines more of the externals leg muscles",
            "Lifting a barbell off of a weight rack, position it on your shoulders",
            "Place your feet about 6 inches apart with your knees & toes pointed slightly outward",
            "Drawing your abs in, descend slowly by bending at the knees & hips as if you are sitting down (squatting)",
            "Lower yourself as far as you can control without letting your body shift towards your toes (this will cause you to loose balance)",
            "Pause in the downward position & slowly return upright to the starting position",
            "Notes: A pad on the bar or towel on your shoulders can help improve your grip & reduce the discomfort of the bar against your back. Practice the squat without any weight to allow yourself to become comfortable with the movements"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0146-relaxation.svg",
            "svg/0146-tension.svg"
        ],
        "png": [
            "png/0146-relaxation.png",
            "png/0146-tension.png"
        ]
    },
    {
        "id": "0147",
        "name": "one-leg-squat-with-barbell",
        "title": "One Leg Squat with Barbell",
        "primer": "The One Leg Squat isolates the muscles of the leg for optimal exercise",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "gastrocnemius",
            "soleus",
            "ischiocrural muscles",
            "glutaeus maximus"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "The One Leg Squat isolates the muscles of the leg for optimal exercise. This exercise is also used to build or rebuild strength after injury",
            "Place a bench or box 12-18 inches tall behind you. The taller the box the greater the difficulty of the exercise",
            "Lifting a barbell off of a weight rack, position it on your shoulders",
            "Place one foot up on the bench, & your other foot firmly on the floor 2-3 feet in front you",
            "Drawing your abs in descend slowly by bending your front knee & hip as if you are sitting down (squatting)",
            "Lower yourself as far as you can control without letting your body shift towards your toe (this will cause you to loose balance)",
            "Pause in the downward position & slowly return upright to the starting position",
            "Switch legs & repeat",
            "Notes: A pad on the bar or towel on your shoulders can help improve your grip & reduce the discomfort of the bar against your back. Practice the squat without any weight to allow yourself to become comfortable with the movements"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0147-relaxation.svg",
            "svg/0147-tension.svg"
        ],
        "png": [
            "png/0147-relaxation.png",
            "png/0147-tension.png"
        ]
    },
    {
        "id": "0148",
        "name": "one-arm-snatch-with-barbell",
        "title": "One Arm Snatch with Barbell",
        "primer": "An advanced exercise that works most of the muscles of the body",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "Deltoid",
            "ischiocrural muscles",
            "erector spinae",
            "abdominals",
            "Trapezius",
            "gastrocnemius",
            "soleus"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "An advanced exercise that works most of the muscles of the body",
            "Exercises like this are used to develop functional strength for sports that require strong h&s",
            "St& with your feet shoulder width apart, & a slight bend in your knees",
            "Grasp the bar with an overhead grip",
            "Starting with the barbell held slightly above the knees (hang position), lift the weight up over your head (step 1) then back to shoulder height (step 2) & finally back to starting position between near your knees"
        ],
        "tips": [
            "Note: Bend your knees as you lift & lower the weight to help control the movement"
        ],
        "references": [],
        "svg": [
            "svg/0148-relaxation.svg",
            "svg/0148-tension.svg"
        ],
        "png": [
            "png/0148-relaxation.png",
            "png/0148-tension.png"
        ]
    },
    {
        "id": "0150",
        "name": "one-arm-side-deadlift-with-barbell",
        "title": "Dead Lift: Barbell (One Arm Side)",
        "primer": "An advanced exercise that works most of the muscles of the body",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "abdominals",
            "glutaeus maximus",
            "gastrocnemius",
            "soleus",
            "ischiocrural muscles"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "An advanced exercise that works most of the muscles of the body. Exercises like this are used to develop functional strength for sports that require strong h&s",
            "St& besides a barbell placed on the floor",
            "Grasp the bar with an overh& grip in the center",
            "Crouching down as if your were performing a squat, bend down so your thighs are parallel with the floor",
            "Extend your legs slowly as you straighten your body up, drawing in your abs as you rise",
            "Note: Perform this exercise with an empty bar to become familiar with the movement before adding weights"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0150-relaxation.svg",
            "svg/0150-tension.svg"
        ],
        "png": [
            "png/0150-relaxation.png",
            "png/0150-tension.png"
        ]
    },
    {
        "id": "0151",
        "name": "overhead-squat-with-barbell",
        "title": "Overhead Squat with Barbell",
        "primer": "In this version of the squat you hold the bar overhead as you perform the exercise",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "glutaeus maximus",
            "gastrocnemius",
            "soleus",
            "ischiocrural muscles",
            "Deltoid",
            "erector spinae"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "St& with your feet a bit wider than shoulder width apart with your toes pointed slightly outward",
            "Grasp a barbell using a wide side snatch grip with your arms & elbows fully extended",
            "Keeping the bar overhead, bend your knees & lower your body until your thighs are parallel with the floor",
            "Return to starting position",
            "Notes: Keep your feet firmly planted on the floor throughout this exercise. Keep your abs drawn in your back tight & your chest up you perform this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0151-relaxation.svg",
            "svg/0151-tension.svg"
        ],
        "png": [
            "png/0151-relaxation.png",
            "png/0151-tension.png"
        ]
    },
    {
        "id": "0152",
        "name": "pile-squat-with-dumbbell",
        "title": "Pile Squat with Dumbbell",
        "primer": "This version of the squat is done with a dumbbell & mimics the action of a pile driver",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "ischiocrural muscles",
            "gastrocnemius",
            "soleus"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "St& with your feet 2-4 inches wider than your shoulders, with your toes pointed out at a 45 degree angle",
            "Grasp a dumbbell with both h&s in the center of your body",
            "Keep your knees slightly bent & your back straight",
            "Squat down as if you were going to sit in a chair, bringing your thighs parallel to the floor",
            "With a controlled motion return to starting position",
            "Notes: Keep your feet planted firmly on the floor throughout this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0152-relaxation.svg",
            "svg/0152-tension.svg"
        ],
        "png": [
            "png/0152-relaxation.png",
            "png/0152-tension.png"
        ]
    },
    {
        "id": "0154",
        "name": "speed-squats-with-barbell",
        "title": "Speed Squats: Barbell",
        "primer": "This version of the squat uses an empty barbell & moves at a faster pace than the st&ard squat",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "gastrocnemius",
            "soleus",
            "glutaeus maximus",
            "ischiocrural muscles"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "This version of the squat uses an empty barbell & moves at a faster pace than the st&ard squat. This is a good exercise for building speed & conditioning used in running & jumping sports",
            "Place your feet slightly wider than shoulder width apart with your knees & toes pointed slightly outward",
            "Drawing your abs in, descend slowly by bending at the knees & hips as if you are sitting down (squatting)",
            "Lower yourself as far as you can control without letting your body shift towards your toes (this will cause you to loose balance)",
            "Pause in the downward position & slowly return upright to the starting position",
            "Note: Keep your feet firmly planted on the floor throughout this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0154-relaxation.svg",
            "svg/0154-tension.svg"
        ],
        "png": [
            "png/0154-relaxation.png",
            "png/0154-tension.png"
        ]
    },
    {
        "id": "0155",
        "name": "squats-with-exercise-bands",
        "title": "Squats: Exercise Bands",
        "primer": "This version of the Squat uses flexible exercise bands for resistance instead of weights",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "gastrocnemius",
            "soleus",
            "glutaeus maximus",
            "ischiocrural muscles"
        ],
        "equipment": [
            "exercise band"
        ],
        "steps": [
            "St& with your feet on the exercise bands with your feet shoulder width apart",
            "Grasp the h&les of the bands & pull them up to your shoulders",
            "With your abs drawn in, squat down until your thighs are parallel with the floor",
            "Slowly return to the starting position",
            "Note: Keep your feet firmly planted on the floor throughout this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0155-relaxation.svg",
            "svg/0155-tension.svg"
        ],
        "png": [
            "png/0155-relaxation.png",
            "png/0155-tension.png"
        ]
    },
    {
        "id": "0156",
        "name": "thigh-abductor",
        "title": "Thigh Abductor",
        "primer": "This exercise targets & works the muscles of the outer thigh",
        "type": "Isolation",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "ischiocrural muscles"
        ],
        "equipment": [
            "machine"
        ],
        "steps": [
            "Sit on the machine & place your knees against the pads",
            "Draw your abs in & “abduct” or move your thighs apart against the pads",
            "Slowly return to the starting position & repeat",
            "Note: Maintain the same level of resistance throughout this exercise for best results"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0156-relaxation.svg",
            "svg/0156-tension.svg"
        ],
        "png": [
            "png/0156-relaxation.png",
            "png/0156-tension.png"
        ]
    },
    {
        "id": "0157",
        "name": "thigh-adductor",
        "title": "Thigh Adductor",
        "primer": "This exercise targets & works the muscles of the inner thigh",
        "type": "Isolation",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "ischiocrural muscles"
        ],
        "equipment": [
            "machine"
        ],
        "steps": [
            "Sit on the machine & place your knees against the pads",
            "Draw your abs in & “adduct” or move your thighs together",
            "Slowly return to the starting position & repeat",
            "Note: Maintain the same level of resistance throughout this exercise for best results"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0157-relaxation.svg",
            "svg/0157-tension.svg"
        ],
        "png": [
            "png/0157-relaxation.png",
            "png/0157-tension.png"
        ]
    },
    {
        "id": "0158",
        "name": "weighted-sissy-squat-with-weight-plate",
        "title": "Weighted Sissy Squat with Weight Plate",
        "primer": "Don't let the name of this exercise fool you, it is a an assisted squat which effectively works the quadriceps",
        "type": "Isolation",
        "primary": [
            "quadriceps"
        ],
        "secondary": [],
        "equipment": [
            "weight plate"
        ],
        "steps": [
            "Don't let the name of this exercise fool you, it is a an assisted squat which effectively works the quadriceps (leg muscles)",
            "Grasp a weight rack or bar for support with one arm & hold a free weight plate across your chest with your other h&",
            "With your abs drawn in, squat down lowering your body to the floor until your knees are almost fully flexed",
            "Return to the starting position",
            "Note: Keep your feet placed firmly on the floor throughout this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0158-relaxation.svg",
            "svg/0158-tension.svg"
        ],
        "png": [
            "png/0158-relaxation.png",
            "png/0158-tension.png"
        ]
    },
    {
        "id": "0160",
        "name": "wide-stance-squat-with-barbell",
        "title": "Wide Stance Squat with Barbell",
        "primer": "This version of the squat uses a wider stance to isolate the inner thigh",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "gastrocnemius",
            "soleus",
            "ischiocrural muscles"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Lifting a barbell off of a weight rack, position it on your shoulders",
            "St& with your feet wider than shoulder width apart (about 30 inches apart) with your toes pointing out",
            "Drawing your abs in descend slowly by bending at the knees & hips as if you are sitting down (squatting)",
            "Lower yourself as far as you can control without letting your body shift towards your toes (this will cause you to loose balance)",
            "Pause in the downward position & slowly return upright to the starting position",
            "Note: A pad on the bar or towel on your shoulders can help improve your grip & reduce the discomfort of the bar against your back. Practice the squat without any weight to allow yourself to become comfortable with the movements"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0160-relaxation.svg",
            "svg/0160-tension.svg"
        ],
        "png": [
            "png/0160-relaxation.png",
            "png/0160-tension.png"
        ]
    },
    {
        "id": "0161",
        "name": "zecher-squats",
        "title": "Zecher Squats",
        "primer": "This variation of squat is similar to a Front Squat, it works to build the Upper muscles of the quadriceps (thighs)",
        "type": "Compound",
        "primary": [
            "quadriceps"
        ],
        "secondary": [
            "glutaeus maximus",
            "ischiocrural muscles",
            "gastrocnemius",
            "soleus"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "This variation of squat is similar to a Front Squat, it works to build the upper muscles of the quadriceps (thighs)",
            "Lift a barbell off of a weight rack & place across your chest. Hold the barbell with your arms crossed",
            "Place your feet slightly wider than shoulder width apart with your knees & toes pointed slightly outward",
            "Drawing your abs in, descend slowly by bending at the knees & hips as if you are sitting down (squatting)",
            "Lower yourself as far as you can control without letting your body shift towards your toes (this will cause you to loose balance)",
            "Pause in the downward position & slowly return upright to the starting position",
            "Note: Practice the squat without any weight to allow yourself to become comfortable with the movements"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0161-relaxation.svg",
            "svg/0161-tension.svg"
        ],
        "png": [
            "png/0161-relaxation.png",
            "png/0161-tension.png"
        ]
    },
    {
        "id": "0162",
        "name": "bench-dips",
        "title": "Bench Dips",
        "primer": "This exercise is one of the most basic & still one of the best for building the triceps",
        "type": "Compound",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [
            "Pectoralis Major"
        ],
        "equipment": [
            "Body"
        ],
        "steps": [
            "This exercise is one of the most basic & still one of the best for building the triceps (muscles on the back of the arm)",
            "Place two benches parallel to each other 3-4 feet apart",
            "Sit on one bench & place your feet on the edge of the other bench so that your legs are suspended between the 2 benches",
            "Cross your feet for support",
            "Hold onto the bench with your h&s for support & slowly lower body towards the floor by bending your elbows",
            "Pause & then return to starting position",
            "Note: Do not go below a 90 degree angle as this can cause on your shoulders"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0162-relaxation.svg",
            "svg/0162-tension.svg"
        ],
        "png": [
            "png/0162-relaxation.png",
            "png/0162-tension.png"
        ]
    },
    {
        "id": "0163",
        "name": "incline-pushdown-with-cable",
        "title": "Incline Pushdown with Cable",
        "primer": "This exercise uses cables to isolate & work the triceps",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "cable"
        ],
        "steps": [
            "This exercise uses cables to isolate & work the triceps (muscles on the back of the arms)",
            "Place an incline bench facing away from a cable pulley",
            "Attach a short straight bar to the pulley & adjust the height so that your arms can extend fully",
            "Lie face up on the bench & grasp the bar with a narrow overh& grip",
            "Keeping your arms straight, slowly push the bar down towards your feet",
            "Pause at the bottom & then return to starting position",
            "Note: Keep your elbows steady throughout this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0163-relaxation.svg",
            "svg/0163-tension.svg"
        ],
        "png": [
            "png/0163-relaxation.png",
            "png/0163-tension.png"
        ]
    },
    {
        "id": "0164",
        "name": "incline-triceps-extension-with-cable",
        "title": "Triceps Extension: Cable (Incline)",
        "primer": "This exercise uses cables to isolate & work the triceps",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "cable"
        ],
        "steps": [
            "This exercise uses cables to isolate & work the triceps (muscles on the back of the arms)",
            "Place an incline bench facing away from a cable pulley",
            "Attach a short straight bar to the pulley & adjust the height so that your arms can extend fully",
            "Lie face up on the bench & grasp the bar with a narrow overh& grip",
            "Starting with your elbows bent overhead, slowly lower the bar towards your feet",
            "Pause at the bottom & then return to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0164-relaxation.svg",
            "svg/0164-tension.svg"
        ],
        "png": [
            "png/0164-relaxation.png",
            "png/0164-tension.png"
        ]
    },
    {
        "id": "0165",
        "name": "lying-triceps-extension-with-cable",
        "title": "Lying Tricep Extension with Cable",
        "primer": "This exercise uses cables to isolate & work the triceps",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "cable"
        ],
        "steps": [
            "This exercise uses cables to isolate & work the triceps (muscles on the back of the arms)",
            "Place a flat bench with the end towards a weight stack",
            "Attach a short straight bar to the pulley & lower the pulley to the bottom of the stack",
            "Lie face up on the bench & grasp the bar with a narrow overh& grip",
            "Starting with your arms extended lower the bar towards the bar towards the stack by bending your elbows",
            "Slowly extend your arms upright & return to the starting position",
            "Note: Keep your elbows level throughout the exercises"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0165-relaxation.svg",
            "svg/0165-tension.svg"
        ],
        "png": [
            "png/0165-relaxation.png",
            "png/0165-tension.png"
        ]
    },
    {
        "id": "0166",
        "name": "one-arm-tricep-extension-with-cable",
        "title": "One Arm Tricep Extension with Cable",
        "primer": "This exercise isolates the triceps muscles individually",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Place a cable pulley on the highest setting & adjust a stirrup h&le to the pulley",
            "St& facing the weight stack & grasp the h&le with & underh& grip",
            "Keep your back straight, your abs drawn in & your knees slightly bent",
            "Starting at the top, push your arm down until it is straight, feeling the concentration in your tricep",
            "Slowly return to starting position",
            "Tips: Keep your elbow close to your side while performing this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0166-relaxation.svg",
            "svg/0166-tension.svg"
        ],
        "png": [
            "png/0166-relaxation.png",
            "png/0166-tension.png"
        ]
    },
    {
        "id": "0168",
        "name": "decline-close-grip-bench-to-skull-crusher",
        "title": "Decline Close Grip Bench to Skull Crusher",
        "primer": "This exercise combines a close grip bench press with triceps extension",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [
            "Pectoralis Major"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Lay with your back on a flat bench",
            "Grip a barbell with a close grip 8-12 inches apart",
            "Keeping your arms close to your sides lower the bar so it touches your chest, approximately an inch below your nipples",
            "Slowly return to starting position, concentrating on your triceps",
            "At the top of the exercise bend your arms down towards your head",
            "Raise the bar back up over your chest & repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0168-relaxation.svg",
            "svg/0168-tension.svg"
        ],
        "png": [
            "png/0168-relaxation.png",
            "png/0168-tension.png"
        ]
    },
    {
        "id": "0169",
        "name": "decline-triceps-extension-with-dumbbell",
        "title": "Triceps Extension: Dumbbell (Decline)",
        "primer": "This exercise combines a decline bench & dumbbells to target the triceps",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Lay face up on a decline bench with a dumbbell in each h&",
            "Extend your arms so they are perpendicular to your chest, & keeping your elbows in one place, lower your h&s so the dumbbells are lowered near your head",
            "Slowly return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0169-relaxation.svg",
            "svg/0169-tension.svg"
        ],
        "png": [
            "png/0169-relaxation.png",
            "png/0169-tension.png"
        ]
    },
    {
        "id": "0170",
        "name": "decline-ez-bar-triceps-extension-with-barbell",
        "title": "Triceps Extension: EZ Bar Barbell (Decline)",
        "primer": "This exercise combines a decline bench & a curved bar to more efficiently work the triceps",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Lay face up on a decline bench & grasp an EZ Bar (Curved Barbell)",
            "Extend your arms so they are perpendicular to your chest, & keeping your elbows in one place, lower the bar toward your head",
            "Slowly return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0170-relaxation.svg",
            "svg/0170-tension.svg"
        ],
        "png": [
            "png/0170-relaxation.png",
            "png/0170-tension.png"
        ]
    },
    {
        "id": "0171",
        "name": "tricep-dips",
        "title": "Triceps Dips: Machine",
        "primer": "This exercise uses a machine to work the triceps while in seated position",
        "type": "Compound",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [
            "Deltoid"
        ],
        "equipment": [
            "machine"
        ],
        "steps": [
            "Adjust the seat of the machine so that the h&les are equal with your elbows",
            "Grasping the h&les, press down with equal pressure until your arms are fully extended",
            "Pause, & then return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0171-relaxation.svg",
            "svg/0171-tension.svg"
        ],
        "png": [
            "png/0171-relaxation.png",
            "png/0171-tension.png"
        ]
    },
    {
        "id": "0172",
        "name": "tricep-dips-using-body-weight",
        "title": "Triceps Dips: Body Weight",
        "primer": "This classic exercise uses the weight of your own body to work your triceps",
        "type": "Compound",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [
            "Deltoid",
            "Pectoralis Major"
        ],
        "equipment": [
            "Body"
        ],
        "steps": [
            "Grasp a set of parallel bars & push yourself up to the starting position",
            "Keeping your elbows close to your body, lower yourself down until your triceps are parallel to the floor",
            "Slowly raise yourself back to the starting position",
            "Note: Keep your abs drawn in & your body straight during this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0172-relaxation.svg",
            "svg/0172-tension.svg"
        ],
        "png": [
            "png/0172-relaxation.png",
            "png/0172-tension.png"
        ]
    },
    {
        "id": "0173",
        "name": "one-arm-triceps-extension-with-dumbbell",
        "title": "Triceps Extension: Dumbbell (One Arm)",
        "primer": "This exercise uses a dumbbell to work each arm individually",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Sit on a bench with your back straight & your abs drawn in",
            "Grasp a dumbbell in your h& & place it behind your neck with your elbow bent",
            "Slowly extend your arm straight up over your head & slowly return to the starting position",
            "Note: Place your free h& across your chest to help steady yourself during this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0173-relaxation.svg",
            "svg/0173-tension.svg"
        ],
        "png": [
            "png/0173-relaxation.png",
            "png/0173-tension.png"
        ]
    },
    {
        "id": "0174",
        "name": "incline-triceps-extension-with-barbell",
        "title": "Triceps Extension: Barbell (Incline)",
        "primer": "This version of a triceps extension uses gravity to increase the resistance of the exercise",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Grasp a barbell with a close grip (4-6 inches apart)",
            "Lie on an incline bench & hold the bar over your head",
            "Lower your arms in a slight arc so your forearms are touching your biceps",
            "Slowly return back to the starting position with the bar over your head"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0174-relaxation.svg",
            "svg/0174-tension.svg"
        ],
        "png": [
            "png/0174-relaxation.png",
            "png/0174-tension.png"
        ]
    },
    {
        "id": "0175",
        "name": "jm-press",
        "title": "JM Press",
        "primer": "An advanced exercise used by bodybuilders & power lifters to build explosive power in the triceps muscle",
        "type": "Compound",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [
            "Deltoid"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "This exercise is named after the inventor, J.M. Blakley. An advanced exercise used by bodybuilders & power lifters to build explosive power in the triceps muscle (back of the arms)",
            "Lay on a flat bench with your head just at the end of the bench",
            "Grasp the bar with a medium overh& grip keeping your elbows close to your side, over your sternum (mid chest)",
            "Lower the bar towards your sternum at a regular pace, then pause for a moment",
            "With a controlled but rapid pace, push the bar back to starting position",
            "Note: The bar should move in straight line, up & down"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0175-relaxation.svg",
            "svg/0175-tension.svg"
        ],
        "png": [
            "png/0175-relaxation.png",
            "png/0175-tension.png"
        ]
    },
    {
        "id": "0176",
        "name": "kneeling-triceps-extension-with-cable",
        "title": "Kneeling Triceps Concentration Extension with Cable",
        "primer": "Concentration exercises limit your range of movement to increase the effectiveness of the movement",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Attach a stirrup h&le to a cable pulley & adjust the pulley up high",
            "Kneeling on your left knee, with the left side of your body turned towards the machine, keep your right leg bent & the upper portion of your thigh parallel to the floor",
            "With your right elbow & upper arm pressed against your inner thigh just above your knee, pull the cable down towards the floor in a slight arcing motion",
            "Slowly to return to starting position",
            "Repeat & switch arms",
            "Note: Keep all of your body still except the arm you are exercising"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0176-relaxation.svg",
            "svg/0176-tension.svg"
        ],
        "png": [
            "png/0176-relaxation.png",
            "png/0176-tension.png"
        ]
    },
    {
        "id": "0177",
        "name": "kneeling-triceps-extension-with-cable-2",
        "title": "Triceps Extension: Cable (Kneeling)",
        "primer": "Kneeling allows you to isolate your triceps more effectively",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Place a bench sideways in front of a high pulley machine",
            "Grasp a straight bar with an over head grip",
            "Kneel on the floor in front of the bench with your back straight & your head down",
            "With your elbows & forearms above your head, push the bar down in an arc so that your forearms are touching the bench",
            "Note: Keep your abs drawn in & your back straight as you perform this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0177-relaxation.svg",
            "svg/0177-tension.svg"
        ],
        "png": [
            "png/0177-relaxation.png",
            "png/0177-tension.png"
        ]
    },
    {
        "id": "0178",
        "name": "low-triceps-extension-with-cable",
        "title": "Triceps Extension: Cable (Low)",
        "primer": "This exercise is done while lying on a seated row station",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Attach a rope to the cable pulley at of a seated row station",
            "Lie on your back on the bench with your head facing the weight stack",
            "Grasp the rope with your palms facing each other & raise your arms over your chest, with your forearms parallel to the floor at a 90 degree angle",
            "Slowly extend your arms upward squeezing your triceps",
            "Return to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0178-relaxation.svg",
            "svg/0178-tension.svg"
        ],
        "png": [
            "png/0178-relaxation.png",
            "png/0178-tension.png"
        ]
    },
    {
        "id": "0179",
        "name": "lying-close-grip-triceps-extension-behind-the-head-with-barbell",
        "title": "Triceps Extension: Barbell (Lying, Close Grip, Behind the Head)",
        "primer": "You can use a barbell or EZ bar to further concentrate the benefit to your triceps",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "You can use a barbell or EZ (curl) bar to further concentrate the benefit to your triceps",
            "Lie flat on a bench on your back",
            "Grasp the bar with a grip approximately 8 inches apart & lower the bar behind your head",
            "Keeping the bar parallel with the floor, bend your arms down in an arc so the bar moves in a direction under your head",
            "Slowly return to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0179-relaxation.svg",
            "svg/0179-tension.svg"
        ],
        "png": [
            "png/0179-relaxation.png",
            "png/0179-tension.png"
        ]
    },
    {
        "id": "0180",
        "name": "lying-close-grip-triceps-press-to-chin-with-barbell",
        "title": "Lying Close Grip Triceps Press to Chin with Barbell",
        "primer": "This exercise is a classic for building the triceps",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Lie on a flat bench on your back, with your head at one end",
            "Grasp a bar with a close grip, approximately 6 inches apart",
            "Raise the bar straight up over your shoulders, keeping your elbows close in",
            "Slowly lower the bar in an arc towards your chin",
            "Return the bar to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0180-relaxation.svg",
            "svg/0180-tension.svg"
        ],
        "png": [
            "png/0180-relaxation.png",
            "png/0180-tension.png"
        ]
    },
    {
        "id": "0181",
        "name": "lying-triceps-extension-with-dumbbells",
        "title": "Triceps Extension: Dumbbell (Lying)",
        "primer": "This exercise uses gravity to increase the resistance of the weight",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Lay on a flat bench with your head at one end & your feet planted firmly on the floor",
            "Grasp a dumbbell with both h&s with palms facing up",
            "Raise dumbbell over your body. Your arms will be pointed towards the ceiling",
            "While keeping your upper arms & elbows still, lower the dumbbell in an arc behind your head",
            "Slowly raise the dumbbell back to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0181-relaxation.svg",
            "svg/0181-tension.svg"
        ],
        "png": [
            "png/0181-relaxation.png",
            "png/0181-tension.png"
        ]
    },
    {
        "id": "0182",
        "name": "lying-triceps-extension-across-face-with-dumbbell",
        "title": "Triceps Extension: Dumbbell (Lying, Across Face)",
        "primer": "An advanced Triceps exercise & should be avoided by beginners",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "An advanced exercise & should be avoided by beginners",
            "Lay on a flat bench with your head at one end & your feet planted firmly on the floor",
            "Grasp a dumbbell in each h& with palms facing up",
            "Raise dumbbells over your body. Your arms will be pointed towards the ceiling",
            "While keeping your upper arms & elbows still, lower the dumbbell slowly over your face bending only your elbow",
            "Slowly raise the dumbbell back to the starting position & repeat with your other arm",
            "Note: Do not perform this exercise if your arms are fatigued, as you are lifting the weight over your face"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0182-relaxation.svg",
            "svg/0182-tension.svg"
        ],
        "png": [
            "png/0182-relaxation.png",
            "png/0182-tension.png"
        ]
    },
    {
        "id": "0183",
        "name": "lying-triceps-press-with-barbell",
        "title": "Lying Triceps Press with Barbell",
        "primer": "Another classic exercise for building the triceps",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [
            "Pectoralis Major"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Lie on a flat bench with your head at one end",
            "Grasp an EZ or Curl bar with an overh& grip",
            "Raise the bar straight up over your shoulders, taking care to keep your elbows in close",
            "Slowly lower the bar in an arc over your head",
            "Return the bar to the starting position",
            "Note: Keep your arms straight throughout this exercise moving only your elbows"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0183-relaxation.svg",
            "svg/0183-tension.svg"
        ],
        "png": [
            "png/0183-relaxation.png",
            "png/0183-tension.png"
        ]
    },
    {
        "id": "0184",
        "name": "lying-two-arm-triceps-extension-with-dumbbell",
        "title": "Triceps Extension: Dumbbell (Lying Two Arm)",
        "primer": "This a lying version of a Triceps Kickback",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Lie flat on a bench, on your back, with your head at one end",
            "Grasp a dumbbell in each h& & raise them at arms length over your shoulders",
            "Lower the dumbbells in an arc bending your elbows until your forearms are touching your biceps",
            "Slowly return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0184-relaxation.svg",
            "svg/0184-tension.svg"
        ],
        "png": [
            "png/0184-relaxation.png",
            "png/0184-tension.png"
        ]
    },
    {
        "id": "0185",
        "name": "old-school-reverse-extensions",
        "title": "Old School Reverse Extensions",
        "primer": "As the name suggests, this is an old classic exercise that hits the triceps hard",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Lie down on a bench, on your back, with your head at one end",
            "Grasp a barbell with an underh& grip",
            "Move your arms beyond your head, keeping them in a straight line",
            "Bending only your elbows, slowly lower & raise the barbell"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0185-relaxation.svg",
            "svg/0185-tension.svg"
        ],
        "png": [
            "png/0185-relaxation.png",
            "png/0185-tension.png"
        ]
    },
    {
        "id": "0186",
        "name": "single-arm-triceps-extension-with-dumbbell",
        "title": "Triceps Extension: Dumbbell (Single Arm, Pronated)",
        "primer": "An advanced exercise to isolate & work the tricep muscles",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "An advanced exercise to isolate & work the tricep (back of the arm) muscles",
            "Lie flat in a bench with your head at one end & your feet placed firmly on the floor",
            "Grasp a dumbbell in one h& & raise it to a position above your chest, with your palm facing your feet",
            "Place your free h& under the shoulder to support your other arm",
            "Slowly lower the weight moving only your forearm & elbow towards & away from your chest",
            "Repeat with your other arm",
            "Note: Practice this exercise with light weight to get used to the movements"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0186-relaxation.svg",
            "svg/0186-tension.svg"
        ],
        "png": [
            "png/0186-relaxation.png",
            "png/0186-tension.png"
        ]
    },
    {
        "id": "0187",
        "name": "single-arm-supinated-triceps-extension-with-dumbbell",
        "title": "Triceps Extension: Dumbbell (Single Arm, Supinated)",
        "primer": "This exercise is similar to the Single Arm Pronated Triceps Extension except the movement is over the head instead of across the chest",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Lie flat in a bench with your head at one end & your feet placed firmly on the floor",
            "Grasp a dumbbell in one h& & raise it to a position above your chest, with your palm facing the floor",
            "Place your free h& under the shoulder to support your other arm. Slowly bend your elbow over your head with the weight moving only your forearm & elbow",
            "Return to the starting position & repeat with your other arm",
            "Note: Practice this exercise with light weight to get used to the movements"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0187-relaxation.svg",
            "svg/0187-tension.svg"
        ],
        "png": [
            "png/0187-relaxation.png",
            "png/0187-tension.png"
        ]
    },
    {
        "id": "0188",
        "name": "close-triceps-pushup",
        "title": "Close Triceps Pushup",
        "primer": "This version of the Pushup isolates the tricep muscles",
        "type": "Compound",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [
            "Pectoralis Major"
        ],
        "equipment": [
            "Body"
        ],
        "steps": [
            "This version of the Pushup isolates the tricep (back of the arm) muscles",
            "Kneel down on the floor or a mat, placing your h& thumbs together & raise your up on your toes",
            "Draw your abs in & keep your back & neck in a straight line",
            "Slowly lower your body towards the floor, by bending your arms, until you are nearly touching the floor",
            "In a controlled manner raise your body back up to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0188-relaxation.svg",
            "svg/0188-tension.svg"
        ],
        "png": [
            "png/0188-relaxation.png",
            "png/0188-tension.png"
        ]
    },
    {
        "id": "0189",
        "name": "reverse-grip-triceps-pushdown",
        "title": "Reverse Grip Triceps Pushdown",
        "primer": "This exercise is the reverse version of the triceps pushdown",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "cable"
        ],
        "steps": [
            "St& in front of a cable machine & attach a bar to a high pulley",
            "Grasp the h&le with palms facing up",
            "Keeping your elbows at your side, pull the h&le down towards your thighs",
            "Pause for a moment & then return to the starting position",
            "Note: You may want to stager one foot in front of the other for a better stance"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0189-relaxation.svg",
            "svg/0189-tension.svg"
        ],
        "png": [
            "png/0189-relaxation.png",
            "png/0189-tension.png"
        ]
    },
    {
        "id": "0190",
        "name": "reverse-triceps-bench-press-with-barbell",
        "title": "Bench Press: Barbell (Reverse Triceps)",
        "primer": "This exercise is a version of the Bench Press that specifically isolates the triceps",
        "type": "Compound",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [
            "Pectoralis Major"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Lie on a flat bench with your head at one end & your feet placed firmly on the floor",
            "Grasp a barbell with palms facing your head about 16 inches apart",
            "Move the bar over your chest (about 1 inch below your nipples)",
            "Extend your arms fully raising the bar fully & then lower the bar to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0190-relaxation.svg",
            "svg/0190-tension.svg"
        ],
        "png": [
            "png/0190-relaxation.png",
            "png/0190-tension.png"
        ]
    },
    {
        "id": "0191",
        "name": "seated-one-arm-triceps-extension-with-dumbbell",
        "title": "Triceps Extension: Dumbbell (Seated, One Arm)",
        "primer": "This exercise uses a kickback movement to work the triceps in each arm individually",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Sit on the edge of a bench with your feet flat on the floor",
            "Hold a dumbbell in your right h&",
            "Bring your right arm up to your side so the dumbbell is almost parallel to your chest, keeping your lower arm vertical",
            "Press your arm back in arc",
            "Return to the starting position repeat & switch arms"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0191-relaxation.svg",
            "svg/0191-tension.svg"
        ],
        "png": [
            "png/0191-relaxation.png",
            "png/0191-tension.png"
        ]
    },
    {
        "id": "0192",
        "name": "seated-two-arm-triceps-extension-with-dumbbell",
        "title": "Triceps Extension: Dumbbell (Seated, Two Arm)",
        "primer": "This exercise is the two h&ed version of seated triceps extension",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Sit on the edge of a bench with your feet flat on the floor",
            "Hold a dumbbell in each h&",
            "Bring your arms up to your side so the dumbbell is almost parallel to your chest, keeping your lower arm vertical",
            "Press your arm back in arc towards your back",
            "Return to the starting position repeat & switch arms"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0192-relaxation.svg",
            "svg/0192-tension.svg"
        ],
        "png": [
            "png/0192-relaxation.png",
            "png/0192-tension.png"
        ]
    },
    {
        "id": "0193",
        "name": "seated-overhead-triceps-extension-with-barbell",
        "title": "Triceps Extension: Barbell (Seated, Overhead)",
        "primer": "This exercise uses a barbell behind your neck to isolate the triceps effectively",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Sit on a short straight back chair with your feet firmly placed on the floor & your back straight",
            "Grasp an EZ or Curl bar, or barbell with a grip about 6 inches apart",
            "Raise the bar to arms length above your head & then lower the bar in an arc towards the floor behind your head",
            "Return to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0193-relaxation.svg",
            "svg/0193-tension.svg"
        ],
        "png": [
            "png/0193-relaxation.png",
            "png/0193-tension.png"
        ]
    },
    {
        "id": "0194",
        "name": "seated-triceps-press-with-dumbbell",
        "title": "Seated Triceps Press with Dumbbell",
        "primer": "This exercise uses a single dumbbell held between both h&s to work the triceps",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Sit on a short, straight backed bench with your feet planted firmly on the floor",
            "Drawing your abs in, grasp the dumbbell with both h&s with a palms up grip",
            "Raise the weight over your head, this is your starting position",
            "Lower the dumbbell in an arc from above your head to behind your back",
            "Slowly return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0194-relaxation.svg",
            "svg/0194-tension.svg"
        ],
        "png": [
            "png/0194-relaxation.png",
            "png/0194-tension.png"
        ]
    },
    {
        "id": "0195",
        "name": "smith-machine-close-grip-bench-press",
        "title": "Bench Press: Smith Machine (Close Grip)",
        "primer": "This version of a Bench Press uses a close grip to isolate the triceps as well as working the chest",
        "type": "Compound",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [
            "Pectoralis Major"
        ],
        "equipment": [
            "Smith Machine"
        ],
        "steps": [
            "Place a flat bench in the middle of a Smith Machine",
            "Using a close grip (about 6 inches apart) unlatch the bar & lower it towards your chest",
            "Pause just before the bar hits your chest & raise the bar by extending your arms to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0195-relaxation.svg",
            "svg/0195-tension.svg"
        ],
        "png": [
            "png/0195-relaxation.png",
            "png/0195-tension.png"
        ]
    },
    {
        "id": "0196",
        "name": "bent-over-one-arm-triceps-extension-with-dumbbell",
        "title": "Triceps Extension: Dumbbell (Bent-Over, One Arm)",
        "primer": "This exercise uses a kickback movement to work the triceps in each arm individually",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "St& with your feet shoulder width apart, your abs drawn in & your back straight as you bend at the waist",
            "Hold a dumbbell in your right h&",
            "Bring your right arm up to your side so the dumbbell is almost parallel to your chest, keeping your lower arm vertical & press your arm back in arc",
            "Return to the starting position repeat & switch arms"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0196-relaxation.svg",
            "svg/0196-tension.svg"
        ],
        "png": [
            "png/0196-relaxation.png",
            "png/0196-tension.png"
        ]
    },
    {
        "id": "0197",
        "name": "bent-over-two-arm-triceps-extension-with-dumbbell",
        "title": "Triceps Extension: Dumbbell (Bent-Over, Two Arm)",
        "primer": "This exercise uses a kickback movement to work the triceps in each arm individually",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "St& with your feet shoulder width apart, your abs drawn in & your back straight as you bend at the waist until your upper body is parallel to the floor",
            "Hold a dumbbell in each h&",
            "Bring your right arm up to your side so the dumbbell in line with your chest, keeping your lower arm vertical & press your arm back in arc",
            "Return to the starting position repeat & switch arms"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0197-relaxation.svg",
            "svg/0197-tension.svg"
        ],
        "png": [
            "png/0197-relaxation.png",
            "png/0197-tension.png"
        ]
    },
    {
        "id": "0198",
        "name": "st&ing-triceps-extension-2",
        "title": "Triceps Extension: Dumbbell (St&ing)",
        "primer": "This exercise works the triceps by reaching behind your neck",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "St& with your feet shoulder width apart, your back straight & your abs drawn in",
            "Hold a dumbbell in both h&s, with your palms facing up",
            "Raise the dumbbell over your head & slowly lower the dumbbell in an arc behind your head",
            "Slowly raise the dumbbell back up to the starting position"
        ],
        "tips": [
            "Keep your elbows close to your head during the exercise"
        ],
        "references": [],
        "svg": [
            "svg/0198-relaxation.svg",
            "svg/0198-tension.svg"
        ],
        "png": [
            "png/0198-relaxation.png",
            "png/0198-tension.png"
        ]
    },
    {
        "id": "0199",
        "name": "one-arm-low-pulley-triceps-extension-with-cable",
        "title": "Triceps Extension: Cable (One Arm, Low-Pulley)",
        "primer": "This exercise uses a cable machine to isolate the triceps",
        "type": "Compound",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Attach a h&le to a low cable pulley machine",
            "St& with your back to the weight stack, your feet shoulder width apart",
            "With your left h&, reach behind you & grasp the h&le",
            "Place your right h& on your left elbow for support",
            "Extend your left arm straight up towards the ceiling & then lower it to the starting position",
            "Repeat & switch arms"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0199-relaxation.svg",
            "svg/0199-tension.svg"
        ],
        "png": [
            "png/0199-relaxation.png",
            "png/0199-tension.png"
        ]
    },
    {
        "id": "0200",
        "name": "st&ing-one-arm-triceps-extension-with-dumbbell",
        "title": "Triceps Extension: Dumbbell (St&ing, One Arm)",
        "primer": "This is a single arm version of a behind the neck triceps exercise",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "St& with your feet shoulder width apart, your back straight & your abs drawn in",
            "Hold a dumbbell in your right h& with your palms facing up",
            "Raise the dumbbell over your head & slowly lower the dumbbell in an arc behind your head, so that the dumbbell lines up with your spine",
            "Slowly raise the dumbbell back up to the starting position",
            "Switch arms & repeat",
            "Note: Keep your elbows close to your head during the exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [],
        "png": []
    },
    {
        "id": "0201",
        "name": "st&ing-overhead-triceps-extension-with-barbell",
        "title": "Triceps Extension: Barbell (St&ing, Overhead)",
        "primer": "This is a double arm barbell version of a behind the neck triceps exercise",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "St& with your feet shoulder width apart, your back straight & your abs drawn in",
            "Hold a barbell or EZ Curl bar about 6-8 inches apart with your palms facing up",
            "Raise the bar over your head & slowly lower the dumbbell in an arc behind your head, towards your back",
            "Slowly raise the bar back up to the starting position",
            "Note: Keep your elbows close to your head during the exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0201-relaxation.svg",
            "svg/0201-tension.svg"
        ],
        "png": [
            "png/0201-relaxation.png",
            "png/0201-tension.png"
        ]
    },
    {
        "id": "0202",
        "name": "st&ing-triceps-extension-with-towel",
        "title": "Triceps Extension: Towel (St&ing)",
        "primer": "This exercise requires another person & uses manual resistance, or your body’s own weight to build muscle",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Body",
            "towel"
        ],
        "steps": [
            "St& with your feet shoulder width apart, your back straight & your abs drawn in",
            "Hold a towel or rope facing up behind & in back of your head",
            "Have a partner hold the towel taught during the exercise so the resistance is constant",
            "Lower your forearms down until they reach your biceps, then slowly raise your arms back up to starting position",
            "Note: Keep your elbows close to your head during the exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0202-relaxation.svg",
            "svg/0202-tension.svg"
        ],
        "png": [
            "png/0202-relaxation.png",
            "png/0202-tension.png"
        ]
    },
    {
        "id": "0203",
        "name": "tate-press-with-dumbbell",
        "title": "Tate Press with Dumbbell",
        "primer": "An advanced triceps exercise which moves the muscle differently than other exercises",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Lay flat on a bench with your head at one end & your feet firmly planted on the floor",
            "Hold a dumbbell in each h& so your palms are facing your feet",
            "Drawing your abs in & keeping your back on the bench, raise the weights to the center of your chest",
            "Without moving elbows, slowly raise your arms up & out contracting your triceps"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0203-relaxation.svg",
            "svg/0203-tension.svg"
        ],
        "png": [
            "png/0203-relaxation.png",
            "png/0203-tension.png"
        ]
    },
    {
        "id": "0204",
        "name": "triceps-kickback-with-dumbbell",
        "title": "Triceps Kickback with Dumbbell",
        "primer": "This along with the Triceps Push Down is one of the most beneficial exercises for the arms",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "St&ing along side a flat bench, bend your left knee & place it on the bench",
            "Place your left h& on the bench for support, keeping your back at a 45 degree angle",
            "Hold a dumbbell in your right h& & place your right foot on the floor",
            "Bend your right arm & raise it up to your shoulder, then with controlled motion kick it back, fully extending your arm",
            "Switch arms & repeat",
            "Note: Keep your elbow close to your body during this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0204-relaxation.svg",
            "svg/0204-tension.svg"
        ],
        "png": [
            "png/0204-relaxation.png",
            "png/0204-tension.png"
        ]
    },
    {
        "id": "0205",
        "name": "triceps-pushdown-with-cable",
        "title": "Triceps Pushdown: Cable",
        "primer": "This exercise is the original version of the triceps pushdown",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "cable"
        ],
        "steps": [
            "St& in front of a cable machine & attach a short bar to a high pulley",
            "Grasp the h&le with your palms facing down",
            "Draw your abs in & keep your back straight",
            "Keeping your elbows at your side push the h&le down towards your thighs",
            "Pause for a moment & then return to the starting position",
            "Note: You may want to stager one foot in front of the other for a better stance"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0205-relaxation.svg",
            "svg/0205-tension.svg"
        ],
        "png": [
            "png/0205-relaxation.png",
            "png/0205-tension.png"
        ]
    },
    {
        "id": "0206",
        "name": "triceps-pushdown-with-rope-&-cable",
        "title": "Triceps Pushdown: Cable (Rope)",
        "primer": "This version of the triceps pushdown uses a rope for better definition in the muscle",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "cable"
        ],
        "steps": [
            "St& in front of a cable machine & attach a rope to a high pulley",
            "Grasp the rope with palms facing down",
            "Draw your abs in & keep your back straight",
            "Keeping your elbows at your side push the rope down towards your thighs, if possible “split” the rope apart at the bottom",
            "Pause for a moment & then return to the starting position",
            "Note: You may want to stager one foot in front of the other for a better stance"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0206-relaxation.svg",
            "svg/0206-tension.svg"
        ],
        "png": [
            "png/0206-relaxation.png",
            "png/0206-tension.png"
        ]
    },
    {
        "id": "0207",
        "name": "triceps-pushdown-with-v-bar-&-cable",
        "title": "Triceps Pushdown: Cable (V-Bar)",
        "primer": "This exercise is the triceps pushdown uses a V shaped bar",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "cable",
            "v-bar"
        ],
        "steps": [
            "This exercise is the triceps pushdown uses a V shaped bar. Many people find this version easier on the elbows",
            "Steps",
            "St& in front of a cable machine & attach a V Bar to a high pulley",
            "Grasp the bar with palms facing down",
            "Draw your abs in & keep your back straight",
            "Keeping your elbows at your side push the bar down towards your thighs",
            "Pause for a moment & then return to the starting position",
            "Note: You may want to stager one foot in front of the other for a better stance"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0207-relaxation.svg",
            "svg/0207-tension.svg"
        ],
        "png": [
            "png/0207-relaxation.png",
            "png/0207-tension.png"
        ]
    },
    {
        "id": "0208",
        "name": "weighted-ball-side-bend",
        "title": "Weighted Ball Side Bend",
        "primer": "This exercise use a Stability Ball instead of a bench to work the obliques",
        "type": "Isolation",
        "primary": [
            "obliques"
        ],
        "secondary": [],
        "equipment": [
            "weight",
            "exercise ball"
        ],
        "steps": [
            "This exercise use a Stability Ball instead of a bench. The Stability Ball conforms better to your body & allows for correct anatomical range of movement",
            "Lie one side of your torso, & with your waist & hip against a Stability Ball, position your feet on the floor (or against a wall) for support",
            "With one h&, hold a weight against the side of your head",
            "Place your free h& across your chest to steady yourself",
            "Raise your torso up off the ball by flexing your waist",
            "With controlled movements lower yourself back onto the ball"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0208-relaxation.svg",
            "svg/0208-tension.svg"
        ],
        "png": [
            "png/0208-relaxation.png",
            "png/0208-tension.png"
        ]
    },
    {
        "id": "0209",
        "name": "incline-triceps-extensions-with-dumbbell",
        "title": "Triceps Extension: Dumbbell (Incline)",
        "primer": "This version of the triceps extension uses an incline bench",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [
            "Deltoid"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Grasp a dumbbell in each h& & lie against an incline bench, face up with your feet firmly planted on the floor",
            "Extend your arms over your shoulders with your palms facing each other",
            "Slowly lower the dumbbells behind your head by bending your elbows",
            "With a controlled motion raise your arms back up to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0209-relaxation.svg",
            "svg/0209-tension.svg"
        ],
        "png": [
            "png/0209-relaxation.png",
            "png/0209-tension.png"
        ]
    },
    {
        "id": "0210",
        "name": "triceps-extensions-using-machine",
        "title": "Triceps Extension: Machine",
        "primer": "This exercise uses a machine to insure proper range of motion for tricep extensions",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii"
        ],
        "secondary": [],
        "equipment": [
            "machine"
        ],
        "steps": [
            "Name: This exercise uses a machine to insure proper range of motion. This is a good exercise for beginners & people rehabilitating from injury",
            "Adjust the seat height of the machine so your upper arms & elbows lie flat on the pad. Draw your abs in & sit upright with your back straight. With your arms fully extended grasp the h&les & pull them towards your body. Hold for a moment & then slowly return to the starting position",
            "Note: Stay seated & keep your feet firmly on the floor throughout this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0210-relaxation.svg",
            "svg/0210-tension.svg"
        ],
        "png": [
            "png/0210-relaxation.png",
            "png/0210-tension.png"
        ]
    },
    {
        "id": "0211",
        "name": "biceps-curls-with-barbell",
        "title": "Biceps Curl: Barbell",
        "primer": "This is a basic exercise for the biceps",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "Deltoid",
            "forearm"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "This is a basic exercise for the biceps (arms)",
            "St& with your feet shoulder width apart, your knees slightly bent & your abs drawn in",
            "Grasp a barbell with palms facing up, approximately shoulder width apart",
            "Lower your arms fully to above your thighs & bending only your elbows, raise the bar to your upper chest",
            "Pause for a moment & then return to the starting position",
            "Note: Do not swing your hips or back during this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0211-relaxation.svg",
            "svg/0211-tension.svg"
        ],
        "png": [
            "png/0211-relaxation.png",
            "png/0211-tension.png"
        ]
    },
    {
        "id": "0212",
        "name": "st&ing-biceps-curl-with-cable",
        "title": "St&ing Biceps Curl with Cable",
        "primer": "This version of the biceps curl uses a cable instead of a barbell to work the muscles of the arms",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm",
            "Deltoid"
        ],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Attach a short bar to a cable pulley to the bottom of the weight stack",
            "St& with your feet shoulder width apart, your knees slightly bent & your abs drawn in",
            "Grasp the bar with palms facing up, & h&s fairly close together",
            "Lower your arms fully to above your thighs & bending only your elbows, raise the bar to your upper chest",
            "Pause for a moment & then return to the starting position",
            "Note: Do not swing your hips or back during this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0212-relaxation.svg",
            "svg/0212-tension.svg"
        ],
        "png": [
            "png/0212-relaxation.png",
            "png/0212-tension.png"
        ]
    },
    {
        "id": "0213",
        "name": "alternating-hammer-curl-with-dumbbell",
        "title": "Alternating Hammer Curl with Dumbbell",
        "primer": "This exercise uses a hammering motion to isolate the biceps",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "This exercise uses a hammering (up & down) motion to isolate the biceps",
            "St& with our feet shoulder width apart, your knees slightly bent & your abs drawn in",
            "Grasp a dumbbell in each h& so your palms are facing each other",
            "Extend your arms so they are at the sides of your body",
            "Keeping your elbows locked lift your left arm in an arc towards your left shoulder",
            "Lower your arm & repeat with your right arm",
            "Note: Do not turn your wrists during this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0213-relaxation.svg",
            "svg/0213-tension.svg"
        ],
        "png": [
            "png/0213-relaxation.png",
            "png/0213-tension.png"
        ]
    },
    {
        "id": "0214",
        "name": "alternating-incline-curl-with-dumbbell",
        "title": "Alternating Incline Curl with Dumbbell",
        "primer": "This exercise uses an incline bench to change your body’s position as you perform Biceps Curls",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Adjust an incline bench to a 45 degree angle",
            "Grasp a dumbbell in each h& & sit back on the bench with your feet firmly planted on the floor",
            "Allow your arms to hang down at your sides",
            "Keeping your elbow straight, raise your right arm up towards your head",
            "In a controlled manner lower the weight & repeat with your left arm"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0214-relaxation.svg",
            "svg/0214-tension.svg"
        ],
        "png": [
            "png/0214-relaxation.png",
            "png/0214-tension.png"
        ]
    },
    {
        "id": "0215",
        "name": "lying-incline-curl-with-barbell",
        "title": "Lying Incline Curl with Barbell",
        "primer": "",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "This exercise uses an incline bench to change your body’s position as you perform Biceps Curls. The movement is very similar to a Preacher Curl",
            "Adjust an incline bench to a 45 degree angle",
            "Grasp a barbell with a shoulder width grip & lean face down against the bench, with your feet resting on the floor for support",
            "Allow your arms to hang down at your sides",
            "Keeping your elbows straight, raise the bar up towards your head, contracting your biceps",
            "In a controlled manner lower the weight & repeat",
            "Note: Practice steady movements in this exercise, be careful not to let your arms sway"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0215-relaxation.svg",
            "svg/0215-tension.svg"
        ],
        "png": [
            "png/0215-relaxation.png",
            "png/0215-tension.png"
        ]
    },
    {
        "id": "0216",
        "name": "hammer-curls-with-rope-&-cable",
        "title": "Hammer Curls with Rope & Cable",
        "primer": "Using the rope with the cable machine allows you isolate the biceps with this version of the Hammer Curl",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Using the rope with the cable machine allows you isolate the biceps with this version of the Hammer Curl. This is a good exercise for beginners",
            "Attach a rope to a cable pulley to the bottom of the weight stack. St& with your feet shoulder width apart, your knees slightly bent & your abs drawn in. Grasp the rope with a close underh& grip (palms facing up). Lower your arms fully to above your thighs & bending only your elbows, raise the rope to your upper chest. Pause for a moment & then return to the starting position",
            "Note: Keep your elbows at your side throughout this exercise. Do not swing your hips or back during this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0216-relaxation.svg",
            "svg/0216-tension.svg"
        ],
        "png": [
            "png/0216-relaxation.png",
            "png/0216-tension.png"
        ]
    },
    {
        "id": "0217",
        "name": "preacher-curl-with-cable",
        "title": "Preacher Curl: Cable",
        "primer": "A Preacher Curl uses a special bench to support the triceps & isolate the biceps to build the arms",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Place a padded arm curl bench in front of a cable machine",
            "Attach a short bar to the bottom pulley",
            "Rest your arms against the bench & extend them fully",
            "With a narrow grip (6 inches) grasp the bar with palms facing up & pull it towards your head",
            "Pause for a moment & then lower the bar back to starting position",
            "Note: Perform this exercise in a slow controlled manner for best results"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0217-relaxation.svg",
            "svg/0217-tension.svg"
        ],
        "png": [
            "png/0217-relaxation.png",
            "png/0217-tension.png"
        ]
    },
    {
        "id": "0218",
        "name": "close-grip-ez-bar-curl-with-barbell",
        "title": "Close Grip EZ Bar Curl with Barbell",
        "primer": "This exercise uses a cambered EZ or curl bar to isolate the biceps during a curl",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "St& with your feet shoulder width apart, your knees slightly bent & your abs drawn in",
            "Grasp an EZ bar with an underh& close (4 inch) grip on the innermost part of the bar",
            "Extend your arms fully against your thighs",
            "Keeping your elbows straight, raise the bar towards your chest",
            "Pause for moment & then return to the starting position",
            "Note: Lean up against a wall or post if you have problems keeping from swinging"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0218-relaxation.svg",
            "svg/0218-tension.svg"
        ],
        "png": [
            "png/0218-relaxation.png",
            "png/0218-tension.png"
        ]
    },
    {
        "id": "0219",
        "name": "close-grip-st&ing-biceps-curls-with-barbell",
        "title": "Close Grip St&ing Biceps Curls with Barbell",
        "primer": "This exercise uses a st&ard barbell to isolate the biceps during a curl",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "St& with your feet shoulder width apart, your knees slightly bent & your abs drawn in",
            "Grasp a barbell with palms up, about 12 inches apart",
            "Extend your arms fully against your thighs",
            "Keeping your elbows straight, raise the bar towards your chest until your forearms touch your chest",
            "Pause for moment & then return to the starting position",
            "Note: Lean up against a wall or post if you have problems keeping from swinging"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0219-relaxation.svg",
            "svg/0219-tension.svg"
        ],
        "png": [
            "png/0219-relaxation.png",
            "png/0219-tension.png"
        ]
    },
    {
        "id": "0220",
        "name": "concentration-curls-with-dumbbell",
        "title": "Concentration Curls with Dumbbell",
        "primer": "Concentration exercises limit your range of movement to increase the effectiveness of the movement",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Sit on the end of a flat bench with your feet flat & your legs spread apart",
            "Grasp a dumbbell in your h&, palms facing up",
            "With your elbow pressed against your inner thigh, curl the dumbbell up towards your chest",
            "Slowly return to the starting position",
            "Repeat & switch arms",
            "Note: Keep all of your body still except the arm you are exercising"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0220-relaxation.svg",
            "svg/0220-tension.svg"
        ],
        "png": [
            "png/0220-relaxation.png",
            "png/0220-tension.png"
        ]
    },
    {
        "id": "0221",
        "name": "cross-body-hammer-curl-with-dumbbell",
        "title": "Cross Body Hammer Curl with Dumbbell",
        "primer": "This exercise targets the biceps using a crossing motion rather than a st&ard curl",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "While st&ing, grab a dumbbell in each arm with palms facing in",
            "Keeping your palms facing in (& not twisting your arms) curl the dumbbell up towards your opposite shoulder",
            "Bring the top of dumbbell up to & touching the shoulder",
            "Slowly with a controlled manner, lower the dumbbell back to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0221-relaxation.svg",
            "svg/0221-tension.svg"
        ],
        "png": [
            "png/0221-relaxation.png",
            "png/0221-tension.png"
        ]
    },
    {
        "id": "0222",
        "name": "drag-curl-with-barbell",
        "title": "Drag Curl with Barbell",
        "primer": "This exercise works the biceps & forearms",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "This exercise is credited to the late Vince Gironda, the “Iron Guru”. It not only blasts the biceps & works the forearms as well",
            "St& with your feet shoulder width apart, your knees slightly bent, & your abs drawn in",
            "Grasp the bar with palms down, shoulder width apart",
            "Extend your arms fully so they are against your thighs",
            "Slowly raise your arms, palms down, to touch your chest",
            "Note: Do not move your elbows or shoulders during this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0222-relaxation.svg",
            "svg/0222-tension.svg"
        ],
        "png": [
            "png/0222-relaxation.png",
            "png/0222-tension.png"
        ]
    },
    {
        "id": "0223",
        "name": "alternating-biceps-curl-with-dumbbell",
        "title": "Alternating Bicep Curl with Dumbbell",
        "primer": "This exercise is a single arm version of a biceps curl",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Steps",
            "St& with your feet shoulder width apart, your knees slightly bent & your abs drawn in",
            "Grasp a dumbbell in each h& so your palms are facing up",
            "Extend your arms so they are at the sides of your body",
            "Keeping your elbows locked lift your left arm to your chest so that your forearm touches your bicep",
            "Lower your arm & repeat with your right arm",
            "Note: Do not swing your body as you perform this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0223-relaxation.svg",
            "svg/0223-tension.svg"
        ],
        "png": [
            "png/0223-relaxation.png",
            "png/0223-tension.png"
        ]
    },
    {
        "id": "0224",
        "name": "biceps-curl-with-dumbbell",
        "title": "Biceps Curl: Dumbbell",
        "primer": "This version of a biceps curl uses both arms at the same time",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "St& with our feet shoulder width apart, your knees slightly bent & your abs drawn in",
            "Grasp a dumbbell in each h& with your palms facing up",
            "Extend your arms so they are at the sides of your body",
            "Keeping your elbows, locked lift your arms to your chest so that your forearms touch your biceps",
            "In a slow controlled manner, lower your arms to the starting position",
            "Note: Do not swing your body as you perform this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0224-relaxation.svg",
            "svg/0224-tension.svg"
        ],
        "png": [
            "png/0224-relaxation.png",
            "png/0224-tension.png"
        ]
    },
    {
        "id": "0225",
        "name": "prone-incline-biceps-curl-with-dumbbell",
        "title": "Prone Incline Biceps Curl with Dumbbell",
        "primer": "This exercise uses an incline bench to change your body’s position as you perform Biceps Curls",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "This exercise uses an incline bench to change your body’s position as you perform Biceps Curls. The movement is very similar to a Preacher Curl",
            "Adjust an incline bench to a 45 degree angle",
            "Grasp dumbbells in each h& & lean face down against the bench, with your feet resting on the floor for support",
            "Allow your arms to hang down at your sides",
            "Keeping your elbow straight, raise the dumbbells up towards your head, contracting your biceps",
            "In a controlled manner, lower the weight & repeat",
            "Note: Practice steady movements in this exercise, be careful not to let your arms sway"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0225-relaxation.svg",
            "svg/0225-tension.svg"
        ],
        "png": [
            "png/0225-relaxation.png",
            "png/0225-tension.png"
        ]
    },
    {
        "id": "0226",
        "name": "ez-bar-curl-with-barbell",
        "title": "EZ Bar Curl with Barbell",
        "primer": "This exercise uses an EZ or curl bar to better isolate & build the arms",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "St& with your feet shoulder width apart & your knees slightly bent",
            "Grasp the barbell with palms up",
            "Lower the bar so it is against your thighs",
            "Keeping your elbows still, raise the bar up to your chest so that your forearms touch your biceps",
            "Note: Lean up against a wall or post to keep yourself from swaying"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0226-relaxation.svg",
            "svg/0226-tension.svg"
        ],
        "png": [
            "png/0226-relaxation.png",
            "png/0226-tension.png"
        ]
    },
    {
        "id": "0227",
        "name": "biceps-hammer-curl-with-dumbbell",
        "title": "Biceps Curl: Dumbbell (Hammer)",
        "primer": "This exercise uses a hammering motion to isolate the biceps",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "This exercise uses a hammering (up & down) motion to isolate the biceps",
            " St& with your feet shoulder width apart, your knees slightly bent & your abs drawn in",
            "Grasp a dumbbell in each h& so your palms are facing each other",
            "Extend your arms so they are at the sides of your body",
            "Keeping your elbows locked lift your arms in an arc towards your shoulders",
            "Lower your arms in a steady controlled motion & repeat",
            "Note: Do not turn your wrists during this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0227-relaxation.svg",
            "svg/0227-tension.svg"
        ],
        "png": [
            "png/0227-relaxation.png",
            "png/0227-tension.png"
        ]
    },
    {
        "id": "0228",
        "name": "flexor-incline-curls-with-dumbbell",
        "title": "Flexor Incline Curls with Dumbbell",
        "primer": "This exercise was designed to keep the stress on the biceps",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Sit on an incline bench with your feet firmly on the floor in front of you",
            "Grasp a dumbbell with your palms facing up",
            "Bring your arms down to your sides & while keeping your wrists as straight as possible, raise your wrists to your shoulders",
            "Concentrate on squeezing your biceps as you contract (raise) your arms"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0228-relaxation.svg",
            "svg/0228-tension.svg"
        ],
        "png": [
            "png/0228-relaxation.png",
            "png/0228-tension.png"
        ]
    },
    {
        "id": "0229",
        "name": "high-cable-curls",
        "title": "High Cable Curls",
        "primer": "This exercise allows you to target the muscles of your arms from a different position",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "Triceps Brachii"
        ],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Place a flat bench next to a cable weigh stack",
            "Attach a short bar to the high pulley",
            "Lay on your back with your head towards the stack",
            "Grip the bar with palms facing you)& extend your arms fully on a slight angle over your head",
            "Pull the bar down towards you, curling your arms as much as possible",
            "Slowly return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0229-relaxation.svg",
            "svg/0229-tension.svg"
        ],
        "png": [
            "png/0229-relaxation.png",
            "png/0229-tension.png"
        ]
    },
    {
        "id": "0230",
        "name": "incline-inner-biceps-curl-with-dumbbell",
        "title": "Incline Biceps Curl with Dumbbell",
        "primer": "This exercise uses an incline bench to change your body’s position as you perform Biceps Curls",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "This exercise uses an incline bench to change your body’s position as you perform Biceps Curls. The movement is very similar to a Preacher Curl",
            "Adjust an incline bench to a 45 degree angle",
            "Grasp dumbbells in each h& & sit down with your back against the bench, with your feet resting on the floor for support",
            "Allow your arms to hang down at your sides",
            "Keeping your elbow straight, raise the dumbbells up towards your head, contracting your biceps",
            "In a controlled manner lower the weight & repeat",
            "Note: Practice steady movements in this exercise, be careful not to let your arms sway"
        ],
        "tips": [],
        "references": [],
        "svg": [],
        "png": []
    },
    {
        "id": "0231",
        "name": "incline-inner-biceps-curl-with-dumbbell-2",
        "title": "Incline Inner Biceps Curl with Dumbbell",
        "primer": "This exercise uses an incline bench & twist to more to change your body’s position as you perform Biceps Curls",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "This exercise uses an incline bench & twist to more to change your body’s position as you perform Biceps Curls. The movement is very similar to a Preacher Curl",
            " Adjust an incline bench to a 45 degree angle",
            "Grasp dumbbells in each h& with & sit down with your back against the bench, with your feet resting on the floor for support",
            "Allow your arms to hang down at your sides, your palms facing your body",
            "Keeping your elbow straight, raise the dumbbells up towards your head, contracting your biceps",
            "In a controlled manner lower the weight & repeat",
            "Note: Practice steady movements in this exercise, be careful not to let your arms sway"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0231-relaxation.svg",
            "svg/0231-tension.svg"
        ],
        "png": [
            "png/0231-relaxation.png",
            "png/0231-tension.png"
        ]
    },
    {
        "id": "0232",
        "name": "lying-bicep-cable-curl",
        "title": "Lying Bicep Cable Curl",
        "primer": "By lying down you are able to isolate the muscles of your biceps without st&ing or sitting",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Attach a short bar to a cable pulley set on the lowest setting",
            "Lie down on a mat or the floor with your feet touching the weight stack",
            "Grasp the bar with & palms facing up",
            "With your arms fully extended & your elbows at your sides, pull the bar in an arc to your chest",
            "Pause for a moment contracting your biceps, & then return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0232-relaxation.svg",
            "svg/0232-tension.svg"
        ],
        "png": [
            "png/0232-relaxation.png",
            "png/0232-tension.png"
        ]
    },
    {
        "id": "0233",
        "name": "lying-close-grip-biceps-curls-with-cable",
        "title": "Lying Close Grip Biceps Curls with Cable",
        "primer": "This exercise combines a flat body position with a pulling motion to work the biceps",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Place a flat bench under a cable weight stack & attach a flat bar to the pulley",
            "Lie down with your head towards the stack & your feet firmly on the floor",
            "Grasp the bar with your palms down, about 8 inches apart, & extend your arms straight up",
            "Curl the bar down in an arc touching your chin",
            "Slowly return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0233-relaxation.svg",
            "svg/0233-tension.svg"
        ],
        "png": [
            "png/0233-relaxation.png",
            "png/0233-tension.png"
        ]
    },
    {
        "id": "0234",
        "name": "lying-high-bench-biceps-curl-with-barbell",
        "title": "Lying High Bench Biceps Curl with Barbell",
        "primer": "",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "With this exercise your lay face down to isolate your biceps",
            "Lay face down on a high bench with your head at one end & your toes pressed against the floor to support you",
            "Grasp a barbell with palms facing up, about 12 inches apart",
            "Extending your arms to the floor, curl your arms back towards your head in a slight arc, so your biceps touch your forearm",
            "Slowly return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0234-relaxation.svg",
            "svg/0234-tension.svg"
        ],
        "png": [
            "png/0234-relaxation.png",
            "png/0234-tension.png"
        ]
    },
    {
        "id": "0235",
        "name": "lying-supine-biceps-curl-with-dumbbell",
        "title": "Lying Supine Biceps Curl with Dumbbell",
        "primer": "An advanced biceps exercise where you lay down to isolate the muscles you are working",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Another biceps exercise where you lay down to isolate the muscles you are working. An advanced exercise",
            "Lie on a flat bench with your head at one end & your feet planted firmly on the floor",
            "With a dumbbell in each h&, palms facing in, bring your arms down to your sides, hanging off the bench",
            "Slowly raise your arms up until they are level with your chest",
            "Curl the dumbbells by twisting your palms, so that your forearms touch your biceps",
            "Slowly lower your arms to the starting position",
            "Note: Practice the motions of this exercise with light weights to become familiar with the movements"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0235-relaxation.svg",
            "svg/0235-tension.svg"
        ],
        "png": [
            "png/0235-relaxation.png",
            "png/0235-tension.png"
        ]
    },
    {
        "id": "0236",
        "name": "preacher-curl-with-machine",
        "title": "Preacher Curl: Machine",
        "primer": "A Preacher Curl uses a special bench to support the triceps & isolate the biceps to build the arms",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "machine"
        ],
        "steps": [
            "A Preacher Curl uses a special bench to support the triceps & isolate the biceps to build the arms. This version of the exercises is a machine exercise. This is a good exercise for beginners",
            "Adjust the seat of the bench so your arms are level with the top of the bench. Rest your arms against the bench & extend them fully. Grasp the bar underh& (palms facing up) & pull it towards your head. Pause for a moment & then lower the bar back to starting position",
            "Note: Perform this exercise in a slow controlled manner for best results. Read the instructions on the machine before performing this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0236-relaxation.svg",
            "svg/0236-tension.svg"
        ],
        "png": [
            "png/0236-relaxation.png",
            "png/0236-tension.png"
        ]
    },
    {
        "id": "0237",
        "name": "one-arm-preacher-curl-with-dumbbell",
        "title": "Preacher Curl: Dumbbell (One Arm)",
        "primer": "",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "A Preacher Curl uses a special bench to support the triceps & isolate the biceps to build the arms. This version uses dumbbells & single arm movements for better control",
            "Adjust the seat of the bench so your arm is level with the top of the bench",
            "Grasp a dumbbell in your h& with palms facing up",
            "Rest your arm against the bench & extend it fully down",
            "Keeping your arm on the bench at all times, curl the dumbbell up towards your head",
            "Pause for a moment & then lower the dumbbell back to starting position",
            "Switch arms & repeat",
            "Note: Perform this exercise in a slow controlled manner for best results"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0237-relaxation.svg",
            "svg/0237-tension.svg"
        ],
        "png": [
            "png/0237-relaxation.png",
            "png/0237-tension.png"
        ]
    },
    {
        "id": "0238",
        "name": "overhead-curl-with-cable",
        "title": "Overhead Curl with Cable",
        "primer": "By using cable, this exercise isolates & defines the biceps muscles",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [],
        "equipment": [
            "cable"
        ],
        "steps": [
            "By using cable this exercise isolates & defines the biceps (arm) muscles",
            "Attach a stirrup h&le to each side of a high pulley on a cable machine",
            "Grasp the h&les with palms facing up & st& with your feet shoulder width apart",
            "Extend your arms fully to each side",
            "Keeping your elbows steady, curl your wrists towards the sides of your head",
            "Contract your biceps & pause for a moment",
            "Then return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0238-relaxation.svg",
            "svg/0238-tension.svg"
        ],
        "png": [
            "png/0238-relaxation.png",
            "png/0238-tension.png"
        ]
    },
    {
        "id": "0239",
        "name": "preacher-curl-with-barbell",
        "title": "Preacher Curl: Barbell",
        "primer": "A Preacher Curl uses a special bench to support the triceps & isolate the biceps to build the arms",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "&nbsp;",
            "Adjust the seat of the bench so that your arms are level with the top of the bench",
            "Grasp the bar with palms facing up, shoulder width apart",
            "Picking up the bar, rest your arms against the bench & extend them fully",
            "Keeping your arms on the bench at all times, curl the bar up towards your head",
            "Pause for a moment & then lower the bar back to starting position",
            "Note: Perform this exercise in a slow controlled manner for best results"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0239-relaxation.svg",
            "svg/0239-tension.svg"
        ],
        "png": [
            "png/0239-relaxation.png",
            "png/0239-tension.png"
        ]
    },
    {
        "id": "0240",
        "name": "preacher-hammer-curl-with-dumbbell",
        "title": "Preacher Curl: Dumbbell (Hammer)",
        "primer": "This exercise combines a Hammer Curl with a Preacher bench",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Adjust the seat of the bench so that your arms are level with the top of the bench",
            "Grasp a dumbbell in each h& with your palms facing each other, shoulder width apart & extend your arms fully along the bench",
            "Keeping your arms & elbows on the bench at all times, curl the dumbbells up towards your head",
            "Pause for a moment & then lower the bar back to starting position",
            "Note: Perform this exercise in a slow controlled manner for best results"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0240-relaxation.svg",
            "svg/0240-tension.svg"
        ],
        "png": [
            "png/0240-relaxation.png",
            "png/0240-tension.png"
        ]
    },
    {
        "id": "0241",
        "name": "reverse-plate-curls-with-weight",
        "title": "Reverse Plate Curls with Weight",
        "primer": "This exercise uses a free weight plate to build muscle",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "weight plate"
        ],
        "steps": [
            "St& with your feet shoulder width apart, your knees slightly bent & your abs drawn in",
            "Grasp a plate in your h&s with palms facing down, at the 11:00 & 1:00 o’clock position",
            "Keeping your elbows & arms at your side, curl the slowly up towards your head",
            "Slowly return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0241-relaxation.svg",
            "svg/0241-tension.svg"
        ],
        "png": [
            "png/0241-relaxation.png",
            "png/0241-tension.png"
        ]
    },
    {
        "id": "0242",
        "name": "seated-close-grip-concentration-curls-with-barbell",
        "title": "Seated Close Grip Concentration Curls with Barbell",
        "primer": "Concentration exercises limit your range of movement to increase the effectiveness of the movement",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Concentration exercises limit your range of movement to increase the effectiveness of the movement. This version uses a barbell",
            "Sit on the end of a flat bench with your feet flat & your legs spread apart",
            "Bend forward at your waist keeping your back straight",
            "Grasp a barbell in your h&s with a close grip approximately 6 inches apart with your palms facing up",
            "With your elbow pressed against your inner thigh, curl the bar up towards your chest",
            "Slowly lower the bar to the starting position near the floor",
            "Note: Keep all of your body still except the arm you are exercising"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0242-relaxation.svg",
            "svg/0242-tension.svg"
        ],
        "png": [
            "png/0242-relaxation.png",
            "png/0242-tension.png"
        ]
    },
    {
        "id": "0243",
        "name": "seated-biceps-curl-with-dumbbell",
        "title": "Seated Bicep Curl with Dumbbell",
        "primer": "This exercise is a seated biceps curl using dumbbells",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Sit on bench with your feet firmly on the floor & your back straight",
            "Grasp a dumbbell in each h& with your palms facing each other",
            "Lower the dumbbells to your sides & slowly curl your arms up so your palms are facing up",
            "Squeeze your biceps at the top & slowly lower to the starting position",
            "Note: If possible use a short backed bench to help your posture"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0243-relaxation.svg",
            "svg/0243-tension.svg"
        ],
        "png": [
            "png/0243-relaxation.png",
            "png/0243-tension.png"
        ]
    },
    {
        "id": "0244",
        "name": "seated-inner-biceps-curl-with-dumbbell",
        "title": "Seated Inner Biceps Curl with Dumbbell",
        "primer": "This exercise works the inner biceps",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Sit on the edge of a bench with your feet firmly planted on the floor",
            "Keep your back straight & your abs drawn in",
            "Grasp a dumbbell in each arm with your palms facing each other & fully extend your arms along your sides",
            "Curl your arms up & out, turning your palms up & out as you lift",
            "Slowly lower the dumbbells to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0244-tension.svg"
        ],
        "png": [
            "png/0244-relaxation.png",
            "png/0244-tension.png"
        ]
    },
    {
        "id": "0245",
        "name": "spider-curl-with-barbell",
        "title": "Spider Curl with Barbell",
        "primer": "",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "This exercise uses the straight side of a Preacher Curl bench to increase the range of motion of the exercise",
            "Turn a Preacher Curl bench around so you are leaning against the angled side",
            "Grasp a barbell with palms up, approximately 6 inches apart",
            "Leaning against the bench, lower the bar along the flat side of the bench fully extending your arms",
            "Curl your arms up so your biceps are touching your forearms",
            "Slowly lower the bar to the starting position",
            "Note: Use a low weight to get used to the motion of this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0245-relaxation.svg",
            "svg/0245-tension.svg"
        ],
        "png": [
            "png/0245-relaxation.png",
            "png/0245-tension.png"
        ]
    },
    {
        "id": "0246",
        "name": "st&ing-inner-biceps-curl-with-dumbbell",
        "title": "St&ing Inner Biceps Curl with Dumbbell",
        "primer": "This exercise works the inner biceps",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "St& with your feet shoulder width apart, your knees slightly bent & your abs drawn in",
            "Grasp a dumbbell in each arm with your palms facing each other, fully extend your arms along your sides",
            "Curl your arms up & out, turning your palms up & out as you lift",
            "Slowly lower the dumbbells to the starting position",
            "Note: Try to keep your forearms in line with your shoulders as you lift the weight"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0246-relaxation.svg",
            "svg/0246-tension.svg"
        ],
        "png": [
            "png/0246-relaxation.png",
            "png/0246-tension.png"
        ]
    },
    {
        "id": "0247",
        "name": "st&ing-one-arm-biceps-curl-with-cable",
        "title": "St&ing One Arm Bicep Curl with Cable",
        "primer": "This is a single arm version of a bicep cable curl",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "cable"
        ],
        "steps": [
            "This is a single arm version of a bicep cable curl. Cable machines are great for helping you learn proper form while building muscle",
            "Attach a stirrup bar to a low cable pulley",
            "St& of the side of the weight stack with your legs shoulder width apart & your knees slightly bent & your abs drawn in",
            "Grasp the stirrup in one h& with an palms facing up",
            "Lower the stirrup to the top of your thighs",
            "Keeping your elbows still, curl the stirrup up towards your chest",
            "Slowly lower the stirrup to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0247-relaxation.svg",
            "svg/0247-tension.svg"
        ],
        "png": [
            "png/0247-relaxation.png",
            "png/0247-tension.png"
        ]
    },
    {
        "id": "0248",
        "name": "st&ing-one-arm-curl-over-incline-bench-with-dumbbell",
        "title": "St&ing One Arm Curl Over Incline Bench with Dumbbell",
        "primer": "",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "This exercise is a great alternative to the Preacher Curl",
            "St& in front of an incline bench so your arm is resting on the top of the angled portion of the bench",
            "Grasp a dumbbell in your h& with palms facing up",
            "Rest your arm against the back bench & extend it fully down",
            "Keeping your arm on the bench at all times, curl the dumbbell up towards your head",
            "Pause for a moment & then lower the dumbbell back to starting position",
            "Switch arms & repeat",
            "Note: Perform this exercise in a slow controlled manner for best results"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0248-relaxation.svg",
            "svg/0248-tension.svg"
        ],
        "png": [
            "png/0248-relaxation.png",
            "png/0248-tension.png"
        ]
    },
    {
        "id": "0249",
        "name": "two-arm-preacher-curl-with-dumbbell",
        "title": "Preacher Curl: Dumbbell (Two Arm)",
        "primer": "This version of a Preacher Curl uses a special bench & dumbbells",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "A Preacher Curl uses a special bench to support the triceps & isolate the biceps to build the arms. This version of the exercise uses dumbbells",
            "Adjust the seat of the bench so your arms are level with the top of the bench",
            "Grasp a dumbbell in each h& with palms facing up",
            "Picking up the dumbbells, rest your arms against the bench & extend them fully towards the floor",
            "Keeping your arms on the bench at all times, curl the weight up towards your head",
            "Pause for a moment & then lower the weights back to starting position",
            "Note: Perform this exercise in a slow controlled manner for best results"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0249-relaxation.svg",
            "svg/0249-tension.svg"
        ],
        "png": [
            "png/0249-relaxation.png",
            "png/0249-tension.png"
        ]
    },
    {
        "id": "0250",
        "name": "wide-grip-st&ing-biceps-curl-with-barbell",
        "title": "Wide Grip St&ing Biceps Curl with Barbell",
        "primer": "This is a wide grip version of a biceps curl",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "This is a wide grip version of a biceps curl. The wider grip targets the lateral or outer portion of the muscle",
            "St& with your feet shoulder width apart, your knees slightly bent & your abs drawn in",
            "Grasp a barbell with palms up as wide as you comfortably can",
            "Extend your arms fully against your thighs",
            "Keeping your elbows straight, raise the bar towards your chest until your forearms touch your chest",
            "Pause for moment & then return to the starting position",
            "Note: Lean up against a wall or post if you have problems keeping from swinging"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0250-relaxation.svg",
            "svg/0250-tension.svg"
        ],
        "png": [
            "png/0250-relaxation.png",
            "png/0250-tension.png"
        ]
    },
    {
        "id": "0251",
        "name": "zottman-curl-with-dumbbells",
        "title": "Zottman Curl with Dumbbells",
        "primer": "An advanced exercise where you turn the dumbbells up & out",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "St& with your feet shoulder width apart, your knees slightly bent & your & your abs drawn in",
            "Grasp a dumbbell in each h& with your palms facing each other",
            "Start with your h&s at your sides",
            "Curl your arms up turning your wrists so they are facing down as the dumbbells reach your chest",
            "Pause for a moment & then return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0251-relaxation.svg",
            "svg/0251-tension.svg"
        ],
        "png": [
            "png/0251-relaxation.png",
            "png/0251-tension.png"
        ]
    },
    {
        "id": "0252",
        "name": "zottman-preacher-curl-with-dumbbells",
        "title": "Preacher Curl: Dumbbell (Zottman)",
        "primer": "An advanced exercise where you turn the dumbbells up & out using a Preacher Curl bench for support",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Sit at a Preacher Curl Bench",
            "Grasp a dumbbell in your h& with your palms facing up",
            "Extend your arm fully along the bench",
            "Curl your arm up turning your wrist so it faces down as the dumbbell reaches your chest",
            "Pause for a moment & then return to the starting position & switch arms"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0252-relaxation.svg",
            "svg/0252-tension.svg"
        ],
        "png": [
            "png/0252-relaxation.png",
            "png/0252-tension.png"
        ]
    },
    {
        "id": "0253",
        "name": "biceps-curl-with-machine",
        "title": "Biceps Curl: Machine",
        "primer": "This exercise uses a machine to insure proper form",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "machine"
        ],
        "steps": [
            "Adjust the seat of the machine so your elbows are correctly aligned with the rotation axis",
            "Press your arms against the pads & keep them stationary throughout the exercise",
            "Curl your forearms until your arms are fully flexed",
            "Slowly lower your arms back to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0253-relaxation.svg",
            "svg/0253-tension.svg"
        ],
        "png": [
            "png/0253-relaxation.png",
            "png/0253-tension.png"
        ]
    },
    {
        "id": "0254",
        "name": "one-arm-biceps-curl-with-olympic-bar-or-barbell",
        "title": "One Arm Bicep Curl with Olympic Bar or Barbell",
        "primer": "An advanced exercise for building stability & the muscles of the arms",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "St& with your feet shoulder width apart & your knees slightly bent",
            "Grasp an Olympic bar (empty weight bar) in the middle with one h& so that the bar is equally balanced",
            "Keep your free h& at your side for support",
            "Curl the bar up so your forearm touches your bicep",
            "Slowly lower the bar & change arms",
            "Note: If an Olympic bar is too heavy use a lighter weight barbell"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0254-relaxation.svg",
            "svg/0254-tension.svg"
        ],
        "png": [
            "png/0254-relaxation.png",
            "png/0254-tension.png"
        ]
    },
    {
        "id": "0255",
        "name": "biceps-curl-seated-on-stability-ball-with-dumbbell",
        "title": "Biceps Curl: Stability Ball with Dumbbell (seated)",
        "primer": "This version of a biceps curl uses a Stability Ball",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "This version of a biceps curl uses a Stability Ball. Exercises preformed with Stability Balls encourage better posture & core muscle development",
            "Grasp a dumbbell in each h& while sitting on a Stability Ball with your feet placed firmly in front of you, & your abs drawn in",
            "Keeping your elbows at your side & your back straight, curl your arms up to your chest",
            "Pause for a moment, contracting your biceps",
            "Slowly lower your arms to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0255-relaxation.svg",
            "svg/0255-tension.svg"
        ],
        "png": [
            "png/0255-relaxation.png",
            "png/0255-tension.png"
        ]
    },
    {
        "id": "0256",
        "name": "biceps-curl-squat-with-dumbbell",
        "title": "Biceps Curl: Squat with Dumbbell",
        "primer": "This exercise combines a squat with a curl to effectively work the entire body",
        "type": "Isolation, Compound",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "ischiocrural muscles",
            "glutaeus maximus"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "This exercise combines a squat with a curl to effectively work the entire body. An advanced exercise",
            "St& with your feet shoulder width apart, your knees slightly bent & your abs drawn in",
            "Grasp a dumbbell in each h& & curl your arms up to your shoulders",
            "Bending at the waist, squat down as you lower your h&s to the floor (the lower part of a curl)",
            "Pause for a moment & then return to the starting position",
            "Note: Contract your biceps as you curl your arms up"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0256-relaxation.svg",
            "svg/0256-tension.svg"
        ],
        "png": [
            "png/0256-relaxation.png",
            "png/0256-tension.png"
        ]
    },
    {
        "id": "0257",
        "name": "biceps-curl-reverse-with-dumbbells",
        "title": "Biceps Curl: Dumbbell (Reverse)",
        "primer": "This is a reverse curl exercise that works all of the muscles of the arms",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "St& with your feet shoulder width apart, your knees slightly bent & your abs drawn in",
            "Grasp a dumbbell in each h& with palms facing down",
            "Keeping your arms at your side your elbows steady, lift the dumbbells up towards your shoulders",
            "Pause for a moment & then return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0257-relaxation.svg",
            "svg/0257-tension.svg"
        ],
        "png": [
            "png/0257-relaxation.png",
            "png/0257-tension.png"
        ]
    },
    {
        "id": "0258",
        "name": "one-arm-bicep-concentration-on-stability-ball-with-dumbbell",
        "title": "One Arm Bicep Concentration on Stability Ball with Dumbbell",
        "primer": "This exercise uses a Stability Ball instead of a bench for better form",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "forearm"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Grasp a dumbbell in one h& & sit on a Stability Ball with your feet wide apart",
            "Bend forward leaning at the waist",
            "With the dumbbell in your h&, place your elbow against your knee",
            "Lower your arm so it is flat against your calves",
            "Curl your arm up to your chest keeping your elbow steady",
            "Return to starting position & change h&s"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0258-relaxation.svg",
            "svg/0258-tension.svg"
        ],
        "png": [
            "png/0258-relaxation.png",
            "png/0258-tension.png"
        ]
    },
    {
        "id": "0259",
        "name": "biceps-curl-with-deadlift-with-barbell",
        "title": "Dead Lift: Barbell (Biceps Curl)",
        "primer": "This exercise combines a bicep curl with a deadlift",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "gastrocnemius",
            "soleus",
            "erector spinae",
            "ischiocrural muscles"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "An advanced exercise. This exercise combines a bicep curl with a deadlift",
            "Grasp an EZ Curl or barbell with palms facing up",
            "St&ing with your feet shoulder width apart & your knees slightly bent, draw your abs in",
            "Extend your arms so the bar rests in front of your thighs",
            "Bending at the waist, bring the bar down to just above the floor",
            "As you return to a st&ing position, bring the bar up & curl your arms bringing your forearms to your biceps",
            "Return the starting position & repeat",
            "Note: Performing this exercise in front of a mirror may help you spot & correct your form"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0259-relaxation.svg",
            "svg/0259-tension.svg"
        ],
        "png": [
            "png/0259-relaxation.png",
            "png/0259-tension.png"
        ]
    },
    {
        "id": "0260",
        "name": "biceps-curl-with-overhead-extension-using-dumbbells-on-stability-ball",
        "title": "Biceps Curl: Stability Ball with Dumbbell (Overhead Extension)",
        "primer": "This exercise requires you to be able to balance kneeling on a stability ball before you can correctly perform this exercise",
        "type": "Isolation",
        "primary": [
            "Triceps Brachii",
            "biceps brachii"
        ],
        "secondary": [
            "forearm",
            "should"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "An advanced exercise. This exercise requires you to be able to balance kneeling on a stability ball before you can correctly perform this exercise",
            "Grasp a dumbbell in each h& with palms facing up",
            "Kneel on a Stability Ball, drawing your abs in & keeping your back straight",
            "Raise one arm up over your shoulder & keep your other arm curled",
            "Bend your raised arm back as if performing a triceps extension while lowering your other arm & curling it back",
            "Return to starting position & repeat arms",
            "Note: Work with a Personal Trainer or Instructor to learn how to safely perform this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0260-relaxation.svg",
            "svg/0260-tension.svg"
        ],
        "png": [
            "png/0260-relaxation.png",
            "png/0260-tension.png"
        ]
    },
    {
        "id": "0261",
        "name": "quick-alternating-biceps-curls-with-band",
        "title": "Quick Alternating Biceps Curls with Band",
        "primer": "This exercise uses a bungy or exercise band for resistance",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "Triceps Brachii"
        ],
        "equipment": [
            "exercise band"
        ],
        "steps": [
            "Place a bungy under your feet & hold the h&les palms forward in your h&s",
            "St& with your feet shoulder width apart, knees slightly bent & your abs drawn in",
            "Curl your arms up & down in an alternating motion, keeping your body straight",
            "As you become comfortable with the motion, increase your speed",
            "Note: Contract your biceps as you curl your arms up"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0261-relaxation.svg",
            "svg/0261-tension.svg"
        ],
        "png": [
            "png/0261-relaxation.png",
            "png/0261-tension.png"
        ]
    },
    {
        "id": "0262",
        "name": "biceps-curl-lunge-with-bowling-motion",
        "title": "Biceps Curl: Medicine Balll (Lunge, Bowling Motion)",
        "primer": "This exercise is similar to the motions of bowling",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "gastrocnemius",
            "soleus",
            "Triceps Brachii",
            "ischiocrural muscles",
            "glutaeus maximus",
            "quadriceps"
        ],
        "equipment": [
            "medicine ball"
        ],
        "steps": [
            "Hold a Medicine Ball in one h& with your palms facing up at shoulder height",
            "Bring one foot back & into a lunge, keeping your front foot stationary & not letting your back knee touch the ground",
            "While lunging, bring the ball down & back as if you were bowling",
            "Bring your arm back up to the starting position, switch legs & repeat",
            "Note: Use slow & steady movements with this exercies"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0262-relaxation.svg",
            "svg/0262-tension.svg"
        ],
        "png": [
            "png/0262-relaxation.png",
            "png/0262-tension.png"
        ]
    },
    {
        "id": "0263",
        "name": "biceps-curl-on-stability-ball-with-leg-raised",
        "title": "Biceps Curl: Stability Ball with Dumbbell (leg raised)",
        "primer": "This exercise incorporates balance along with a bicep curl",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "ischiocrural muscles",
            "forearm",
            "quadriceps",
            "gastrocnemius",
            "soleus"
        ],
        "equipment": [
            "Dumbbell",
            "stability Ball"
        ],
        "steps": [
            "Grasp a dumbbell in each h& with a palms up grip",
            "Place the top of one foot behind you on a Stability Ball (see illustration) as if you were stretching your leg",
            "Keep your back straight & your abs drawn in",
            "Bring your arms down in front of your legs",
            "Raise your arms up, curling & contracting your biceps",
            "Lower your arms & return to starting position & switch legs"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0263-relaxation.svg",
            "svg/0263-tension.svg"
        ],
        "png": [
            "png/0263-relaxation.png",
            "png/0263-tension.png"
        ]
    },
    {
        "id": "0264",
        "name": "lateral-lunge-with-biceps-curl-with-dumbbell",
        "title": "Lateral Lunge with Bicep Curl with Dumbbell",
        "primer": "An advanced exercise that combines a lateral lunge with a bicep curl",
        "type": "Compound, Isolation",
        "primary": [
            "quadriceps",
            "biceps brachii"
        ],
        "secondary": [
            "forearm",
            "ischiocrural muscles",
            "glutaeus maximus",
            "gastrocnemius",
            "soleus",
            "hip abductors"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Grasp a dumbbell in each h& with your palms facing up",
            "St& with your feet together, your back straight & your abs drawn in",
            "Allow your arms to extend down fully in front of your thighs",
            "While keeping your body straight, take a step sideways & then bend your waist & your knee into a lunge",
            "As you go into the lunge, curl your arms up towards your shoulders contracting your biceps",
            "Return to starting position & switch legs",
            "Note: Have a Personal Trainer or Instructor show you how to properly perform this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0264-relaxation.svg",
            "svg/0264-tension.svg"
        ],
        "png": [
            "png/0264-relaxation.png",
            "png/0264-tension.png"
        ]
    },
    {
        "id": "0265",
        "name": "forward-lunge-with-biceps-curl-using-dumbbell",
        "title": "Forward Lunge with Bicep Curl using Dumbbell",
        "primer": "This exercise combines a forward lunge with a bicep curl",
        "type": "Compound, Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "gastrocnemius",
            "soleus",
            "hip abductors",
            "forearm",
            "ischiocrural muscles",
            "glutaeus maximus"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Grasp a dumbbell in each h& with your palms facing up",
            "St& with your feet together, your back straight & your abs drawn in",
            "Allow your arms to extend down fully to the sides of your body",
            "While keeping your body straight, take a step forward then bend your waist & your knee into a lunge",
            "Be careful not to let your back knee drop to the floor",
            "As you go into the lunge, curl your arms up towards your shoulders, contracting your biceps",
            "Return to starting position & switch legs",
            "Note: Have a Personal Trainer or Instructor show you how to properly perform this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0265-relaxation.svg",
            "svg/0265-tension.svg"
        ],
        "png": [
            "png/0265-relaxation.png",
            "png/0265-tension.png"
        ]
    },
    {
        "id": "0266",
        "name": "step-up-single-leg-balance-with-biceps-curl-using-dumbbells",
        "title": "Step Up: Dumbbell (Bicep Curl, Single Leg Balance)",
        "primer": "This exercise combines a step up with a bicep curl",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "core",
            "quadriceps",
            "forearm",
            "ischiocrural muscles",
            "glutaeus maximus",
            "gastrocnemius",
            "soleus"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "An advanced exercise. This exercise combines a step up with a bicep curl",
            "Place a box or bench in front of you",
            "Place a dumbbell in each h& with palms facing up",
            "Keep your back straight, your shoulders back & your abs drawn in",
            "With one leg, step up on to the box & raise your other leg up (as if taking another step)",
            "At the top of the step, curl your arms up by bringing your biceps towards your shoulders",
            "Return to the starting position & switch legs"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0266-relaxation.svg",
            "svg/0266-tension.svg"
        ],
        "png": [
            "png/0266-relaxation.png",
            "png/0266-tension.png"
        ]
    },
    {
        "id": "0267",
        "name": "medicine-ball-biceps-curl-on-stability-ball",
        "title": "Medicine Ball Biceps Curl on Stability Ball",
        "primer": "This exercise combines a new technology, Stability Ball, with a old piece of fitness equipment, the Medicine Ball",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "core",
            "forearm"
        ],
        "equipment": [
            "medicine ball"
        ],
        "steps": [
            "Sit on a Stability Ball with your feet firmly on the floor in front of you",
            "Sit with your back straight, your shoulders back & your abs drawn in",
            "Hold a Medicine Ball in one h& & curl it up bringing your forearm up to your bicep",
            "Return to starting position & switch arms",
            "Note: Grasp the Medicine Ball with your fingers spread wide to balance the ball"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0267-relaxation.svg",
            "svg/0267-tension.svg"
        ],
        "png": [
            "png/0267-relaxation.png",
            "png/0267-tension.png"
        ]
    },
    {
        "id": "0268",
        "name": "stork-stance-biceps-curl-with-dumbbells",
        "title": "Stork Stance Bicep Curl with Dumbbells",
        "primer": "An advanced exercise that requires excellent coordination & balance",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "quadriceps",
            "ischiocrural muscles",
            "glutaeus maximus",
            "gastrocnemius",
            "soleus",
            "Triceps Brachii"
        ],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Grasp a pair of dumbbells in each h&, palms facing up",
            "St&ing on one foot, extend your other foot back (see illustration) & extend your arms down so they are h&ing in front of your leg",
            "While on one foot, curl your arms up contracting your biceps",
            "Return to the starting position & switch legs",
            "Note: Have a Personal Trainer or Instructor show you how to properly perform this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0268-relaxation.svg",
            "svg/0268-tension.svg"
        ],
        "png": [
            "png/0268-relaxation.png",
            "png/0268-tension.png"
        ]
    },
    {
        "id": "0269",
        "name": "biceps-curl-v-sit-on-dome-with-dumbbells",
        "title": "Biceps Curl: V-Sit on Dome with Dumbbells",
        "primer": "This exercise uses a Dome (or Bosu) as a seat forcing you to engage & contract your abs throughout the exercise",
        "type": "Isolation",
        "primary": [
            "biceps brachii"
        ],
        "secondary": [
            "abdominals",
            "core"
        ],
        "equipment": [
            "Dumbbell",
            "bosu ball"
        ],
        "steps": [
            "This exercise uses a Dome (or Bosu) as a seat forcing you to engage & contract your abs throughout the exercise. The name comes from having our body in the shape of a “V”",
            "Grasp a dumbbell in each h& & sit on a dome",
            "Keep your legs together & your knees bent",
            "Draw in & hold your abs & keep your back straight",
            "With you arms extended to your sides, curl & contract your biceps, bringing your forearms towards your shoulders",
            "Slowly return to the starting position",
            "Note: Try to keep your balance steady & not move your legs throughout this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0269-relaxation.svg",
            "svg/0269-tension.svg"
        ],
        "png": [
            "png/0269-relaxation.png",
            "png/0269-tension.png"
        ]
    },
    {
        "id": "0270",
        "name": "ankle-circles",
        "title": "Ankle Circles",
        "primer": "This is the most simple of all exercises for the calves",
        "type": "Isolation",
        "primary": [
            "gastrocnemius",
            "soleus"
        ],
        "secondary": [],
        "equipment": [
            "Body"
        ],
        "steps": [
            "St& on one foot near a chair or wall for support",
            "Lift your foot off the ground & draw circles clockwise in the air with your toes",
            "Reverse the direction (counter-clockwise) as well as switch feet"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0270-relaxation.svg",
            "svg/0270-tension.svg"
        ],
        "png": [
            "png/0270-relaxation.png",
            "png/0270-tension.png"
        ]
    },
    {
        "id": "0271",
        "name": "balance-board",
        "title": "Balance Board",
        "primer": "Your calves are stabilizing muscles for your legs, so this exercises uses a Balance Board or wobble board to force you to balance",
        "type": "Compound",
        "primary": [
            "gastrocnemius",
            "soleus"
        ],
        "secondary": [
            "quadriceps",
            "ischiocrural muscles"
        ],
        "equipment": [
            "balance board"
        ],
        "steps": [
            "Place a Balance Board on the floor",
            "Step onto the board with both feet & try to balance yourself",
            "Note: Keep a slight bend in your knees to help you balance"
        ],
        "tips": [],
        "references": [],
        "svg": [],
        "png": []
    },
    {
        "id": "0272",
        "name": "seated-calf-raise-with-barbell",
        "title": "Seated Calf Raise with Barbell",
        "primer": "This version of a calves raise uses a block & a barbell",
        "type": "Isolation",
        "primary": [
            "gastrocnemius",
            "soleus"
        ],
        "secondary": [],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Place a block on the floor about one foot in front of a bench",
            "Sit on the bench with a barbell across your upper thighs & the balls of your feet on the block",
            "Slowly raise & lower your toes up as high as possible without lifting your foot off the block"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0272-relaxation.svg",
            "svg/0272-tension.svg"
        ],
        "png": [
            "png/0272-relaxation.png",
            "png/0272-tension.png"
        ]
    },
    {
        "id": "0273",
        "name": "calves-press-on-leg-machine",
        "title": "Calves Press on Leg Machine",
        "primer": "This exercise uses a Leg Press Machine to work your calves",
        "type": "Isolation",
        "primary": [
            "gastrocnemius",
            "soleus"
        ],
        "secondary": [],
        "equipment": [
            "machine"
        ],
        "steps": [
            "This exercise uses a Leg Press Machine to work your calves. You can perform this exercise along with Leg Presses",
            "Sit down on a Leg Press Machine & press the plate up as if you were performing a leg press",
            "Slide your feet down so that the balls of your feet are pressing against the rack (with your heels hanging free)",
            "Keeping the h&les locked, press up & flex your toes & then slowly bring your toes back towards your body",
            "Perform theses movements slowly for maximum benefit",
            "Note: Use a lighter weight on this exercise than you are able to lift with a leg press until you are familiar with the movements"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0273-relaxation.svg",
            "svg/0273-tension.svg"
        ],
        "png": [
            "png/0273-relaxation.png",
            "png/0273-tension.png"
        ]
    },
    {
        "id": "0274",
        "name": "calf-raises-with-band",
        "title": "Calf Raises with Band",
        "primer": "",
        "type": "Isolation",
        "primary": [
            "gastrocnemius",
            "soleus"
        ],
        "secondary": [],
        "equipment": [
            "exercise band"
        ],
        "steps": [
            "This exercise uses a band to create resistance",
            "St& with your toes on an exercise band & raise the h&les up to your shoulders",
            "Raise up on your toes, keeping your h&s up by your shoulders",
            "Pause for a moment & then lower your heel to the floor",
            "Repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0274-relaxation.svg",
            "svg/0274-tension.svg"
        ],
        "png": [
            "png/0274-relaxation.png",
            "png/0274-tension.png"
        ]
    },
    {
        "id": "0275",
        "name": "donkey-calf-raises",
        "title": "Donkey Calf Raises",
        "primer": "An old school gym exercise which requires the assistance of another person",
        "type": "Isolation",
        "primary": [
            "gastrocnemius",
            "soleus"
        ],
        "secondary": [],
        "equipment": [
            "Body"
        ],
        "steps": [
            "An old school gym exercise which requires the assistance of another person. An advanced exercise & not recommended for beginners",
            "Bend your waist & lean your arms against a weight rack or bench that is waist height",
            "Have a partner sit on top of your lower back",
            "Raise up on your toes leaning slightly forward",
            "Pause at the top & then lower your heels to the floor",
            "Note: Have a Personal Trainer or Instructor show you how to perform this exercise safely"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0275-relaxation.svg",
            "svg/0275-tension.svg"
        ],
        "png": [
            "png/0275-relaxation.png",
            "png/0275-tension.png"
        ]
    },
    {
        "id": "0276",
        "name": "seated-one-leg-calf-raise-with-dumbbell",
        "title": "Seated One Leg Calf Raise with Dumbbell",
        "primer": "This version of a calf raise allows you to exercise each leg individually",
        "type": "Isolation",
        "primary": [
            "gastrocnemius",
            "soleus"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "This version of a calf raise allows you to exercise each leg individually. This exercise is helpful to people who are rehabilitating from injury as it allows you flexibility with the weight",
            "Place a block on the floor about one foot in front of a bench",
            "Sit on the bench with a dumbbell across your upper thigh & the balls of one foot on the block",
            "Slowly raise & lower your toe up as high as possible without lifting your foot off the block",
            "Switch feet & repeat"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0276-relaxation.svg",
            "svg/0276-tension.svg"
        ],
        "png": [
            "png/0276-relaxation.png",
            "png/0276-tension.png"
        ]
    },
    {
        "id": "0277",
        "name": "knee-circles",
        "title": "Knee Circles",
        "primer": "This is a simple exercise & a great stretch",
        "type": "Compound",
        "primary": [
            "gastrocnemius",
            "soleus"
        ],
        "secondary": [
            "ischiocrural muscles"
        ],
        "equipment": [
            "Body"
        ],
        "steps": [
            "St& with your feet a little closer than shoulder width apart",
            "Keeping your arms across your chest or on your hips, move your knees in a circular motion, paying attention to keeping your feet flat on the floor & the movement in your ankles",
            "Note: Do not perform this exercise is you have rolled or unstable ankles"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0277-relaxation.svg",
            "svg/0277-tension.svg"
        ],
        "png": [
            "png/0277-relaxation.png",
            "png/0277-tension.png"
        ]
    },
    {
        "id": "0278",
        "name": "rocking-st&ing-calf-raise-with-barbell",
        "title": "Rocking St&ing Calf Raise with Barbell",
        "primer": "This exercise uses a simple rocking motion to strengthen the calves",
        "type": "Isolation",
        "primary": [
            "gastrocnemius",
            "soleus"
        ],
        "secondary": [],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "St& with a bar across your shoulders",
            "With your feet flat on the floor, lift your feet up & forward as if you are performing a calf raise",
            "Then “rock” back onto your ankles so your toes are flexed & off the floor",
            "Return to starting position",
            "Note: Wear running or cross training shoes while performing this exercise. Try performing this exercise without weight to become familiar with the movement,"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0278-relaxation.svg",
            "svg/0278-tension.svg"
        ],
        "png": [
            "png/0278-relaxation.png",
            "png/0278-tension.png"
        ]
    },
    {
        "id": "0279",
        "name": "seated-calf-raise-using-machine",
        "title": "Seated Calf Raise using Machine",
        "primer": "This is one of the simplest & most effective exercises for the calves",
        "type": "Isolation",
        "primary": [
            "gastrocnemius",
            "soleus"
        ],
        "secondary": [],
        "equipment": [
            "machine"
        ],
        "steps": [
            "Sit at a calf raise machine",
            "Put the balls of your feet on the footpad",
            "Place your thighs under the leg pad above your knees",
            "Unlock the bar & slowly raise your toes up as far as possible",
            "Pause for a moment & then return to the starting position",
            "Note: Practice slow & precise movements with this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0279-relaxation.svg",
            "svg/0279-tension.svg"
        ],
        "png": [
            "png/0279-relaxation.png",
            "png/0279-tension.png"
        ]
    },
    {
        "id": "0280",
        "name": "smith-machine-reverse-calf-raises",
        "title": "Smith Machine Reverse Calf Raises",
        "primer": "This is a unique exercise that works the tibialis anterior muscle, one of the muscles of the calves",
        "type": "Isolation",
        "primary": [
            "gastrocnemius",
            "soleus"
        ],
        "secondary": [],
        "equipment": [
            "Smith Machine"
        ],
        "steps": [
            "Place a block or low box under the bar at a Smith Machine",
            "St& on the edge of the box with your toes hanging off",
            "Place the bar across your shoulders & lean forward lifting your ankles off the box",
            "Return to the starting position",
            "Note: Use the bar for support as you perform this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0280-relaxation.svg",
            "svg/0280-tension.svg"
        ],
        "png": [
            "png/0280-relaxation.png",
            "png/0280-tension.png"
        ]
    },
    {
        "id": "0281",
        "name": "st&ing-barbell-calf-raise",
        "title": "St&ing Barbell Calf Raise",
        "primer": "This is st&ing version of a Calf Raise",
        "type": "Isolation",
        "primary": [
            "gastrocnemius",
            "soleus"
        ],
        "secondary": [],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Place a block or two free weight plates on the floor",
            "Place a barbell across your back & step up so the balls of your feet are on the block",
            "Slowly lift your heels up & then lower them back to the floor getting as much of a stretch as possible",
            "Return to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0281-relaxation.svg",
            "svg/0281-tension.svg"
        ],
        "png": [
            "png/0281-relaxation.png",
            "png/0281-tension.png"
        ]
    },
    {
        "id": "0282",
        "name": "st&ing-calf-raises-using-machine",
        "title": "St&ing Calf Raises using Machine",
        "primer": "This exercise uses a machine to allow for proper form",
        "type": "Isolation",
        "primary": [
            "gastrocnemius",
            "soleus"
        ],
        "secondary": [],
        "equipment": [
            "machine"
        ],
        "steps": [
            "This exercise uses a machine to allow for proper form",
            "St& with your toes on the footpad of the machine & adjust your shoulders under the upper pads",
            "Raise up on the balls of your feet, lifting your heels off the pad",
            "Hold for a moment & then return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0282-relaxation.svg",
            "svg/0282-tension.svg"
        ],
        "png": [
            "png/0282-relaxation.png",
            "png/0282-tension.png"
        ]
    },
    {
        "id": "0283",
        "name": "st&ing-calf-raise-with-dumbbell",
        "title": "St&ing Calf Raise with Dumbbell",
        "primer": "This version of a Calf Raise uses dumbbells",
        "type": "Isolation",
        "primary": [
            "gastrocnemius",
            "soleus"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "Place a block or two free weight plates on the floor",
            "Grasp a dumbbell in each h& & step up so the balls of your feet are on the block",
            "Slowly lift your heels up & then lower them back to the floor getting as much of a stretch as possible",
            "Lower your heels & bend your ankles to stretch your calves",
            "Return to starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [],
        "png": []
    },
    {
        "id": "0284",
        "name": "air-bike",
        "title": "Air Bike",
        "primer": "This exercise works your abs by raising your arms to meet your legs",
        "type": "Compound",
        "primary": [
            "abdominals"
        ],
        "secondary": [],
        "equipment": [
            "Body"
        ],
        "steps": [
            "This exercise works your abs by raising your arms to meet your legs. The movements are similar to riding a bike",
            "Lie on your back on a mat",
            "Place your h&s on either side of your head (over your ears)",
            "Raise your legs up, bending your knees & keeping your calves parallel to the floor",
            "Bring your left arm elbow up to meet your right knee, as if riding a bike",
            "Repeat with your right elbow & left knee",
            "Continue alternating sides",
            "Note: Move your arms across your chest, squeezing your abs as you move"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0284-relaxation.svg",
            "svg/0284-tension.svg"
        ],
        "png": [
            "png/0284-relaxation.png",
            "png/0284-tension.png"
        ]
    },
    {
        "id": "0285",
        "name": "ab-rollout-with-barbell",
        "title": "Ab Rollout with Barbell",
        "primer": "This exercise works the abs & lower back & is the proper version of an “ab roller”",
        "type": "Compound",
        "primary": [
            "abdominals"
        ],
        "secondary": [
            "erector spinae",
            "Deltoid"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Place a barbell on the floor at your feet",
            "Bending at the waist, grip the barbell with a shoulder with overh& grip",
            "With a slow controlled motion, roll the bar out so that your back is straight",
            "Keep your arms straight throughout the exercise",
            "Roll back up raising your hips & butt as you return to the starting position",
            "Note: Practice raising your hips & butt as high as you can with this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0285-relaxation.svg",
            "svg/0285-tension.svg"
        ],
        "png": [
            "png/0285-relaxation.png",
            "png/0285-tension.png"
        ]
    },
    {
        "id": "0286",
        "name": "ab-rollout-on-knees-with-barbell",
        "title": "Ab Rollout on Knees with Barbell",
        "primer": "This exercise works the abs & lower back & is the proper version of an “ab roller”",
        "type": "Compound",
        "primary": [
            "abdominals"
        ],
        "secondary": [
            "erector spinae",
            "Deltoid"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "This exercise works the abs & lower back & is the proper version of an “ab roller”. This version is performed on your knees",
            "Place a barbell on the floor in front of you",
            "Start by kneeling in front of the bar, grip the barbell with a shoulder with overh& grip",
            "With a slow controlled motion, roll the bar out so that your back is straight, bend your knees & keep your feet off the floor",
            "Keep your arms straight throughout the exercise",
            "Roll back up bring the bar under your shoulders & return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0286-relaxation.svg",
            "svg/0286-tension.svg"
        ],
        "png": [
            "png/0286-relaxation.png",
            "png/0286-tension.png"
        ]
    },
    {
        "id": "0287",
        "name": "bent-knee-hip-raise",
        "title": "Bent Knee Hip Raise",
        "primer": "This is a good exercise core muscle development",
        "type": "Compound",
        "primary": [
            "abdominals"
        ],
        "secondary": [],
        "equipment": [
            "Body"
        ],
        "steps": [
            "Lie on your back with your arms outstretched to your sides",
            "Bend your knees at a 60 degree angle & hold your feet up just off the floor",
            "Keeping your back & arms down, raise your hips up & off the floor so that your knees are over your chest",
            "Contract your abs for a moment & then return to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0287-relaxation.svg",
            "svg/0287-tension.svg"
        ],
        "png": [
            "png/0287-relaxation.png",
            "png/0287-tension.png"
        ]
    },
    {
        "id": "0288",
        "name": "seated-ab-crunch-with-cable",
        "title": "Seated Ab Crunch with Cable",
        "primer": "This exercise uses the weight of a cable machine to assist in a crunch",
        "type": "Isolation",
        "primary": [
            "abdominals"
        ],
        "secondary": [],
        "equipment": [
            "cable"
        ],
        "steps": [
            "Attach a rope to a high cable pulley",
            "Place a bench in front of cable weight stack",
            "Grasp the rope over your shoulders & sit with your back towards the stack",
            "With your feet firmly on the floor & keeping your hips steady, flex at the waist bringing your elbows towards your knees",
            "Return to the starting position",
            "Note: Perform this exercise in a slow controlled manner"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0288-relaxation.svg",
            "svg/0288-tension.svg"
        ],
        "png": [
            "png/0288-relaxation.png",
            "png/0288-tension.png"
        ]
    },
    {
        "id": "0289",
        "name": "cross-body-crunch",
        "title": "Cross Body Crunch",
        "primer": "This version of the crunch works both the upper & lower portion of the abs",
        "type": "Compound",
        "primary": [
            "abdominals"
        ],
        "secondary": [],
        "equipment": [
            "Body"
        ],
        "steps": [
            "Lie on your back & bring your knees up to a 60 degree angle, keep your feet flat on the floor",
            "Place your h&s on either side of your head (over your ears)",
            "Curl up raising your right elbow & your left knee so that they touch over your chest",
            "Return to the starting position & repeat with alternate arms & legs",
            "Note: Contract your abs as you twist during this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0289-relaxation.svg",
            "svg/0289-tension.svg"
        ],
        "png": [
            "png/0289-relaxation.png",
            "png/0289-tension.png"
        ]
    },
    {
        "id": "0290",
        "name": "crunches-with-legs-on-stability-ball",
        "title": "Crunches with Legs on Stability Ball",
        "primer": "This exercise uses a Stability Ball as the base during your crunches",
        "type": "Isolation",
        "primary": [
            "abdominals"
        ],
        "secondary": [],
        "equipment": [
            "stability ball"
        ],
        "steps": [
            "Lie on your back & place your feet up on a stability ball",
            "Place your h&s across your chest, or on either side of your head",
            "Keeping the small of your back on the floor, raise your head, shoulders & chest up & off the floor",
            "Pause for a moment contracting your abs & then return to the starting position",
            "Note: Take your time & perform this exercise in a slow controlled manner"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0290-relaxation.svg",
            "svg/0290-tension.svg"
        ],
        "png": [
            "png/0290-relaxation.png",
            "png/0290-tension.png"
        ]
    },
    {
        "id": "0291",
        "name": "crunches",
        "title": "Crunches",
        "primer": "",
        "type": "Isolation",
        "primary": [
            "abdominals"
        ],
        "secondary": [],
        "equipment": [
            "Body"
        ],
        "steps": [
            "This is the most common abdominal exercise & possibly the most often improperly performed. Here is how to perform it correctly",
            "Lie on your back with your feet up on a bench & your knees bent at a 90 degree angle",
            "Place your h&s across your chest or on either side of your head (over your ears)",
            "Raise your head, shoulders & chest off the floor & towards your knees, crunching your abs",
            "Hold the position for a moment & then lower to the starting position",
            "Note: Keep your hips straight & your lower back against the floor during this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0291-relaxation.svg",
            "svg/0291-tension.svg"
        ],
        "png": [
            "png/0291-relaxation.png",
            "png/0291-tension.png"
        ]
    },
    {
        "id": "0292",
        "name": "decline-crunch",
        "title": "Decline Crunch",
        "primer": "Using a decline crunch allows you keep your legs steady & isolate all of the abdominal muscles",
        "type": "Isolation",
        "primary": [
            "abdominals"
        ],
        "secondary": [],
        "equipment": [
            "Body"
        ],
        "steps": [
            "Lie on a decline bench face up",
            "Place your feet securely under the pads",
            "Place your h&s either across your chest or on either side of your head (over your ears)",
            "Lay fully back & then rise slowly crunching your abs",
            "Pause for a moment & then return to the starting position",
            "Note: Use the full range of movement in this exercise for the optimal results"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0292-relaxation.svg",
            "svg/0292-tension.svg"
        ],
        "png": [
            "png/0292-relaxation.png",
            "png/0292-tension.png"
        ]
    },
    {
        "id": "0293",
        "name": "decline-oblique-crunch",
        "title": "Decline Oblique Crunch",
        "primer": "This version of a decline crunch isolates the oblique muscles of the abs",
        "type": "Compound",
        "primary": [
            "abdominals"
        ],
        "secondary": [],
        "equipment": [
            "Body"
        ],
        "steps": [
            "This version of a decline crunch isolates the oblique (side) muscles of the abs",
            "Lie on a decline bench face up",
            "Place your feet securely under the pads",
            "Place your h&s either across your chest or on either side of your head (over your ears)",
            "Raise your shoulders & chest up keeping your back straight & bring your left elbow to your right knee, slowly crunching your abs",
            "Pause for a moment & then return to the starting position",
            "Lay fully back & repeat with your right elbow to your left knee"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0293-relaxation.svg",
            "svg/0293-tension.svg"
        ],
        "png": [
            "png/0293-relaxation.png",
            "png/0293-tension.png"
        ]
    },
    {
        "id": "0294",
        "name": "side-bend-with-dumbbell",
        "title": "Side Bend with Dumbbell",
        "primer": "This exercise works the obliques, the muscles on the sides of your abs",
        "type": "Isolation",
        "primary": [
            "abdominals"
        ],
        "secondary": [],
        "equipment": [
            "Dumbbell"
        ],
        "steps": [
            "St& with your feet shoulder width apart, your knees slightly bent & your abs drawn in",
            "Grasp a dumbbell in one h& & st&ing straight upright, bend at the waist as far as possible to one side",
            "Slowly return back up to the staring position",
            "Switch the dumbbell to your other h& & repeat the exercise",
            "Note: Be careful to bend only at your waist & not at the hips or knees"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0294-relaxation.svg",
            "svg/0294-tension.svg"
        ],
        "png": [
            "png/0294-relaxation.png",
            "png/0294-tension.png"
        ]
    },
    {
        "id": "0295",
        "name": "stability-ball-abdominal-crunch",
        "title": "Stability Ball Abdominal Crunch",
        "primer": "This crunch uses a Stability Ball",
        "type": "Isolation",
        "primary": [
            "abdominals"
        ],
        "secondary": [],
        "equipment": [
            "Body"
        ],
        "steps": [
            "This crunch uses a Stability Ball. The ball allows you a better range of movement because it adapts better to your spine",
            "Sit on top of an exercise or stability ball with your feet placed firmly on the floor for support",
            "Position yourself so that your lower back is centered on the middle of the ball",
            "Lie back & bring your h&s across your chest, or on either side of your head (over your ears)",
            "Raise your head, chest & shoulders up crunching your abs as you sit upright",
            "Pause for a moment & then lower yourself to the starting position",
            "Note: For best results, use a full range of motion in this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0295-relaxation.svg",
            "svg/0295-tension.svg"
        ],
        "png": [
            "png/0295-relaxation.png",
            "png/0295-tension.png"
        ]
    },
    {
        "id": "0296",
        "name": "exercise-ball-pull-in",
        "title": "Exercise Ball Pull In",
        "primer": "This exercise uses a ball to isolate & work the lower abdominal muscles",
        "type": "Compound",
        "primary": [
            "abdominals"
        ],
        "secondary": [],
        "equipment": [
            "Body"
        ],
        "steps": [
            "Lay down as if you were performing a pushup",
            "Place your feet & shins over an exercise or stability ball",
            "Keeping your back straight & supporting your weight on your h&s, pull your knees towards your chest, so the ball rolls forward under your ankles",
            "Crunch your abs & then roll the ball back to starting position straighten your legs",
            "Note: Keep your back straight as you perform this exercise"
        ],
        "tips": [],
        "references": [],
        "svg": [
            "svg/0296-relaxation.svg",
            "svg/0296-tension.svg"
        ],
        "png": [
            "png/0296-relaxation.png",
            "png/0296-tension.png"
        ]
    },
    {
        "id": "0298",
        "name": "bent-over-row-with-barbell",
        "title": "Bent Over Row with Barbell",
        "primer": "This exercise focuses on the middle back",
        "type": "Compound",
        "primary": [
            "Latissimus Dorsi"
        ],
        "secondary": [
            "biceps brachii"
        ],
        "equipment": [
            "Barbell"
        ],
        "steps": [
            "Place your feet shoulder width apart",
            "Bend over the bar so your back is flat & parallel to the floor",
            "Grasp the bar a bit wider than shoulder width apart with an overh& grip",
            "Hold the bar at arms length, this is starting position",
            "Slowly raise the bar to the lower part of your chest",
            "Pause for a moment than return to starting position",
            "Note: Keep your head up & your back straight while performing"
        ],
        "tips": [],
        "references": [],
        "svg": [],
        "png": []
    },
    {
        "id": "0300",
        "name": "cuban-dumbbell-press",
        "title": "Cuban Dumbbell Press",
        "primer": "This is a three point exercise for shoulder & middle back strengthening",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "Latissimus Dorsi"
        ],
        "equipment": [
            "Dumbbells"
        ],
        "steps": [
            "Grasp dumbbells in each h& with a pronated grip (palms facing back wards, your shoulder rotated forward",
            "St& upright with your feet shoulder width apart & your knees slightly bent, contract your abdominals",
            "Slowly lift your arms up so elbows are bent & parallel with the floor while you squeeze your shoulders together",
            "then rotate your arms, bringing the dumbbells forward so that they are now above your shoulder & in line with your elbows",
            "In a controlled manner lower your arms & return to the starting position",
            "Repeat"
        ],
        "tips": [
            "Start with a lower weight in order to perfect the technique",
            "Maintain a good upright posture through out the exercise"
        ],
        "references": [],
        "svg": [],
        "png": [
            "png/cuban-dumbbell-press-1.png",
            "png/cuban-dumbbell-press-2.png",
            "png/cuban-dumbbell-press-3.png"
        ]
    },
    {
        "id": "0302",
        "name": "smith-machine-incline-bench-press",
        "title": "Bench Press: Smith Machine (Incline)",
        "primer": "",
        "type": "Isolation",
        "primary": [
            "Pectoralis Major"
        ],
        "secondary": [
            "Triceps Brachii"
        ],
        "equipment": [
            "Smith Machine"
        ],
        "steps": [
            "An exercise for chest, shoulder & triceps strengthening",
            "Place an incline bench at a 45 degree angle in the middle of the Smith Machine",
            "Align the bench so the bar is across the upper portion of your chest",
            "Grasp the bar with a shoulder width grip",
            "Unlock the bar & slowly lower the weight to your chest, do not bounce the bar on your chest",
            "With slow controlled movements, raise the bar back to the starting position"
        ],
        "tips": [],
        "references": [],
        "svg": [],
        "png": []
    }
]
    """.trimIndent()
}