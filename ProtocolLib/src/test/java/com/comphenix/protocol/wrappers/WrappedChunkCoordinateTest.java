package com.comphenix.protocol.wrappers;

import org.junit.BeforeClass;

import com.comphenix.protocol.BukkitInitialization;

public class WrappedChunkCoordinateTest {
	@BeforeClass
	public static void initializeBukkit() throws IllegalAccessException {
		BukkitInitialization.initializePackage();
	}

	/* ChunkCoordinates don't exist anymore
	@Test
	public void test() {
		WrappedChunkCoordinate coordinate = new WrappedChunkCoordinate(1, 2, 3);
		
		assertEquals(1, coordinate.getX());
		assertEquals(2, coordinate.getY());
		assertEquals(3, coordinate.getZ());
	} */
}
