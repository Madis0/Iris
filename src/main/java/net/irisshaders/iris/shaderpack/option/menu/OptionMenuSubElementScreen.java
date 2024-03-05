package net.irisshaders.iris.shaderpack.option.menu;

import net.irisshaders.iris.shaderpack.properties.ShaderProperties;
import net.irisshaders.iris.shaderpack.option.ShaderPackOptions;

import java.util.List;
import java.util.Optional;

public class OptionMenuSubElementScreen extends OptionMenuElementScreen {
	public final String screenId;

	public OptionMenuSubElementScreen(String screenId, OptionMenuContainer container, ShaderProperties shaderProperties, ShaderPackOptions shaderPackOptions, List<String> elementStrings, Optional<Integer> columnCount) {
		super(container, shaderProperties, shaderPackOptions, elementStrings, columnCount);

		this.screenId = screenId;
	}
}
