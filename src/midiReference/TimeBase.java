package midiReference;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Enumeration containing the number of pulses per rhythm value (based on a 24PPQ MIDI sync clock) 
 * @author gmuller
 *
 */
public enum TimeBase {

	NONE(0),

	SIXTY_FOURTH_NOTE(1.5),
	/** 
	 * 2 pulses per 32nd Triplet
	 */
	THIRTY_SECOND_TRIPLET(2),

	/**
	 * 3 pulses per 32nd note
	 */
	THIRTY_SECOND(3),

	/**
	 * 4 Pulses per 16 Triplet
	 */
	SIXTEENTH_TRIPLET(4),

	/**
	 * 6 pulses per 16th note
	 */
	SIXTEENTH(6),

	/**
	 * 8 pulses per 8th Triplet
	 */
	EIGHTH_TRIPLET(8),

	/**
	 * 9 pulses per dotted 16th note
	 */
	DOTTED_SIXTEENTH(9),

	/**
	 * 12 pulses per 8th note
	 */
	EIGHTH(12),

	/**
	 * 16 Pulses per 1/4 Triplet
	 */
	QUARTER_TRIPLET(16),

	/**
	 * 18 pulses per dotted 8th note 
	 */
	DOTTED_EIGHTH(18),

	/**
	 * 24 pulses per 1/4 note
	 */
	QUARTER(24),

	/**
	 * 32 pulses per 1/2 triplet
	 */
	HALF_TRIPLET(32),

	/**
	 * 36 pulses per dotted 1/4 note
	 */
	DOTTED_QUARTER(36),

	/**
	 * 48 pulses per 1/2 note
	 */
	HALF(48),

	/**
	 * 64 pulses per Whole Triplet
	 */
	WHOLE_TRIPLET(64),

	/**
	 * 72 Pulses per dotted 1/2 note
	 */
	DOTTED_HALF(72),

	/**
	 * 96 pulses per whole note
	 */
	WHOLE(96);

	private static final Map<Integer,TimeBase> lookup 
	= new HashMap<Integer,TimeBase>();

	static {
		for(TimeBase s : EnumSet.allOf(TimeBase.class))
			lookup.put(s.getValue(), s);
	}

	private double pulseValue;
	private static int baseValue = 24; 

	TimeBase(double pulseValue){
		this.pulseValue = pulseValue;
	}

	/**
	 * Gets the pulse count reference associated with the enumeration
	 * @return int pulse count reference
	 */
	public int getValue() { 
		return (int) pulseValue; 
	}
	
	/**
	 * Gets the converted pulse count reference associated with the enumeration
	 * @return int converted pulse count reference
	 */
	public int getValue(int convertTo) {
		return (int) (pulseValue * (convertTo/baseValue)); 
	}

	/**
	 * Gets the enumeration represented by the pulse count
	 * @return int converted pulse count reference
	 */
	public static TimeBase get(Integer stepSize) { 
		return lookup.get(stepSize); 
	}

	/**
	 * Gets the enumeration represented by the converted pulse count
	 * @return int converted pulse count reference
	 */
	public static TimeBase get(Integer stepSize, int convertTo) {
		return lookup.get(stepSize / (convertTo/baseValue)); 
	}
}
