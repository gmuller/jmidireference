package com.grantmuller;

//TODO: Consider using "combo" scales to create scales here, and allow the creation of combo scales
//using lower and upper scale values...consult Mathieu...

/**
 * Enum class providing access to scales based on chromatic degree reference. 
 * 
 * @author gmuller
 */

public enum ScaleReference {
	/**
	 * Scale Degrees {1, b2, 2, b3, 3, 4, #4, 5, b6, 6, b7, 7}
	 * Midi Note Numbers {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}
	 */
	CHROMATIC,
	
	/**
	 * Scale Degrees {1, 2, 3, 4, 5, 6, 7}
	 * Midi Note Numbers {0, 2, 4, 5, 7, 9, 11}
	 */
	MAJOR,
	
	/**
	 * Scale Degrees {1, 2, b3, 4, 5, b6, b7}
	 * Midi Note Numbers {0, 2, 3, 5, 7, 8, 10}
	 */
	MINOR,
	
	/**
	 * Scale Degrees {1, 2, b3, 4, 5, b6, 7}
	 * Midi Note Numbers {0, 2, 3, 5, 7, 8, 11}
	 */
	HARMONIC_MINOR,
	
	/**
	 * Scale Degrees {1, 2, b3, 4, 5, b6, 6, b7, 7}
	 * Midi Note Numbers {0, 2, 3, 5, 7, 8, 9, 10, 11}
	 */
	MELODIC_MINOR, // mix of ascend and descend
	
	/**
	 * Scale Degrees {1, 2, b3, 4, 5, b6, b7}
	 * Midi Note Numbers {0, 2, 3, 5, 7, 8, 10}
	 */
	NATURAL_MINOR,
	
	/**
	 * Scale Degrees {1, 2, b3, 4, 5, b6, b7}
	 * Midi Note Numbers {0, 2, 3, 5, 7, 8, 10}
	 */
	DIATONIC_MINOR,
	
	/**
	 * Scale Degrees {1, 2, b3, 4, 5, b6, b7}
	 * Midi Note Numbers {0, 2, 3, 5, 7, 8, 10}
	 */
	AEOLIAN,
	
	/**
	 * Scale Degrees {1, b2, b3, 4, 5, b6, b7}
	 * Midi Note Numbers {0, 1, 3, 5, 7, 8, 10}
	 */
	PHRYGIAN,
	
	/**
	 * Scale Degrees {1, b2, b3, 4, b5, b6, b7}
	 * Midi Note Numbers {0, 1, 3, 5, 6, 8, 10}
	 */
	LOCRIAN,
	
	/**
	 * Scale Degrees {1, 2, b3, 4, 5, 6, b7}
	 * Midi Note Numbers {0, 2, 3, 5, 7, 9, 10}
	 */
	DORIAN,	
	
	/**
	 * Scale Degrees {1, 2, 3, #4, 5, 6, b7}
	 * Midi Note Numbers {0, 2, 4, 6, 7, 9, 10}
	 */
	LYDIAN,
	
	/**
	 * Scale Degrees {1, 2, 3, 4, 5, 6, b7}
	 * Midi Note Numbers {0, 2, 4, 5, 7, 9, 10}
	 */
	MIXOLYDIAN,
	
	/**
	 * Scale Degrees {1, 2, 3, 5, 6}
	 * Midi Note Numbers {0, 2, 4, 7, 9}
	 */
	PENTATONIC,
	
	/**
	 * Scale Degrees {1, 2, b3, 3, 4, 5, 6, b7, 7}
	 * Midi Note Numbers {0, 2, 3, 4, 5, 7, 9, 10, 11}
	 */
	BLUES,
	
	/**
	 * Scale Degrees {1, b2, b3, 4, 5, b7, 7}
	 * Midi Note Numbers {0, 1, 3, 5, 7, 10, 11}
	 */
	TURKISH,
	
	/**
	 * Scale Degrees {1, b2, b2, 3, 4, #5, b7}
	 * Midi Note Numbers {0, 1, 1, 4, 5, 8, 10}
	 */
	INDIAN;
	
	private static final int[] 	CHROMATIC_SCALE = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
					MAJOR_SCALE = {0, 2, 4, 5, 7, 9, 11},
					MINOR_SCALE = {0, 2, 3, 5, 7, 8, 10},
					HARMONIC_MINOR_SCALE = {0, 2, 3, 5, 7, 8, 11},
					MELODIC_MINOR_SCALE = {0, 2, 3, 5, 7, 8, 9, 10, 11}, // mix of ascend and descend
					NATURAL_MINOR_SCALE = {0, 2, 3, 5, 7, 8, 10},
					DIATONIC_MINOR_SCALE = {0, 2, 3, 5, 7, 8, 10},
					AEOLIAN_SCALE = {0, 2, 3, 5, 7, 8, 10},
					PHRYGIAN_SCALE = {0, 1, 3, 5, 7, 8, 10},
					LOCRIAN_SCALE = {0, 1, 3, 5, 6, 8, 10},
					DORIAN_SCALE = {0, 2, 3, 5, 7, 9, 10},	
					LYDIAN_SCALE = {0, 2, 4, 6, 7, 9, 11},
					MIXOLYDIAN_SCALE = {0, 2, 4, 5, 7, 9, 10},
					PENTATONIC_SCALE = {0, 2, 4, 7, 9},
					BLUES_SCALE = {0, 2, 3, 4, 5, 7, 9, 10, 11},
					TURKISH_SCALE = {0, 1, 3, 5, 7, 10, 11},
					INDIAN_SCALE = {0, 1, 1, 4, 5, 8, 10};
	
	/**
	 * Gets the integer array containing the scale degrees of the scale. For instance, at 
	 * any octave let the base note of the scale equal 0, the degrees for a major scale would 
	 * then be {0, 2, 4, 5, 7, 9, 11}
	 * 
	 * @return int array containing the degrees between 0 - 12 representing the scale
	 */
	public int[] getDegrees(){
		switch (this){
		case CHROMATIC: return CHROMATIC_SCALE;
		case MAJOR: return MAJOR_SCALE;
		case MINOR: return MINOR_SCALE;
		case HARMONIC_MINOR: return HARMONIC_MINOR_SCALE;
		case MELODIC_MINOR: return MELODIC_MINOR_SCALE; // mix of ascend and descend
		case NATURAL_MINOR: return NATURAL_MINOR_SCALE;
		case DIATONIC_MINOR: return DIATONIC_MINOR_SCALE;
		case AEOLIAN: return AEOLIAN_SCALE;
		case PHRYGIAN: return PHRYGIAN_SCALE;
		case LOCRIAN: return LOCRIAN_SCALE;
		case DORIAN: return DORIAN_SCALE;
		case LYDIAN: return LYDIAN_SCALE;
		case MIXOLYDIAN: return MIXOLYDIAN_SCALE;
		case PENTATONIC: return PENTATONIC_SCALE;
		case BLUES: return BLUES_SCALE;
		case TURKISH: return TURKISH_SCALE;
		case INDIAN: return INDIAN_SCALE;
		}
		throw new AssertionError("Unknown Scale: " + this);
	}
}
