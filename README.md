# JMidiReference

MidiReference is a Java library created to make using midi with Java (and Processing) more musical. The library can be added any project and used to to translate back in forth between MIDI and musical terms. This class does not provide access to the MIDI I/O of the machine, but is rather a way for the developer to act on and create MIDI events based on musical language.

MidiReference is made up of the following classes:

<dl class="dl-horizontal">
    <dt>MidiReference</dt>
    <dd>Contains methods to translate midi note numbers and events into scales, chords, and other meaningful musical data.</dd>
    <dt>NoteReference</dt>
    <dd>Enum class providing access to base note numbers and string names</dd>
    <dt>ChordReference</dt>
    <dd>Enum class providing access to integer arrays of various types of chords</dd>
    <dt>ScaleReference</dt>
    <dd>Enum class providing access to integer arrays of various types of scales</dd>
    <dt>TimeBase</dt>
    <dd>Enum class providing access to rhythm values based on a 24PPQ Midi Clock. Useful when syncing MIDI to and external device</dd>
</dl>

Please report any problems, suggestions, feedback here.

## Documentation

Javadocs can be found <a href="http://www.grantmuller.com/MidiReference/doc/index.html">here</a>

## Download

<a href="https://github.com/downloads/gmuller/jmidireference/jmidireference-1.0.jar">jmidirefence 1.0</a>

You can check out the source or report an issue <a href="https://github.com/gmuller/jmidireference/issues">here</a>