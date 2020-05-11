package com.github.dabasan.sample.joglf.g3.audio.sound;

import static com.github.dabasan.basis.coloru8.ColorU8Functions.*;
import static com.github.dabasan.basis.matrix.MatrixFunctions.*;
import static com.github.dabasan.basis.vector.VectorFunctions.*;

import com.github.dabasan.basis.matrix.Matrix;
import com.github.dabasan.basis.vector.Vector;
import com.github.dabasan.joglf.al.front.ALFront;
import com.github.dabasan.joglf.al.sound.Sound3DFunctions;
import com.github.dabasan.joglf.gl.draw.DrawFunctions3D;
import com.github.dabasan.joglf.gl.window.JOGLFWindow;
import com.github.dabasan.tool.MathFunctions;

class Sound3DTestWindow extends JOGLFWindow {
	private int sound_handle;
	private Vector sound_position;

	@Override
	public void Init() {
		ALFront.Initialize();

		sound_handle = Sound3DFunctions.LoadSound("./Data/Sound/test.wav");
		sound_position = VGet(50.0f, 0.0f, 0.0f);
		Sound3DFunctions.SetSoundSourcePosition(sound_handle, sound_position);
		Sound3DFunctions.SetSoundLoopFlag(sound_handle, true);
		Sound3DFunctions.SetSoundMaxDistance(sound_handle, 100.0f);
		Sound3DFunctions.SetSoundReferenceDistance(sound_handle, 50.0f);

		Sound3DFunctions.SetListenerPosition(VGet(0.0f, 0.0f, 0.0f));
		Sound3DFunctions.SetListenerOrientation(VGet(0.0f, 0.0f, 1.0f),
				VGet(0.0f, 1.0f, 0.0f));

		Sound3DFunctions.PlaySound(sound_handle);
	}

	@Override
	public void Update() {
		final Matrix rot_y = MGetRotY(MathFunctions.DegToRad(0.5f));
		sound_position = VTransform(sound_position, rot_y);

		Sound3DFunctions.SetSoundSourcePosition(sound_handle, sound_position);
	}

	@Override
	public void Draw() {
		DrawFunctions3D.DrawAxes_Positive(100.0f);
		DrawFunctions3D.DrawSphere3D(sound_position, 10.0f, 16, 16,
				GetColorU8(1.0f, 1.0f, 1.0f, 1.0f));
	}

	@Override
	public void Dispose() {
		ALFront.Dispose();
	}
}
