# Skill
Built on the blank Template skill

## Description
Collect individual pronunciation of specified utterance. 

## Usage
Furhat asks human to say the utterance.
Human speaks the utterance.
Repeat the human utterance as heard by Furhat.
Write Furhat utterance recognition to file (./saywhat.csv').
Use the collected pronunciations to create Speech Recognition Phrases.

## Code Examples
Setup for CNM. Modify nlu.kt and saywhat.kt to adapt for a different phrase.
nlu.kt - Create list of phrases misheard by Furhat when human says 'CNM'. 
saywhat.kt - Control the code flow with human intent matching any of the recognition phrases.
logresponse.kt - Write to file

