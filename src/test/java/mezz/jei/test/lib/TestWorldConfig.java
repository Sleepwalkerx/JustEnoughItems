package mezz.jei.test.lib;

import mezz.jei.config.IWorldConfig;

public class TestWorldConfig implements IWorldConfig {
	@Override
	public boolean isOverlayEnabled() {
		return true;
	}

	@Override
	public void toggleOverlayEnabled() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isEditModeEnabled() {
		return false;
	}

	@Override
	public void toggleEditModeEnabled() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isCheatItemsEnabled() {
		return false;
	}

	@Override
	public boolean isDeleteItemsInCheatModeActive() {
		return false;
	}

	@Override
	public void toggleCheatItemsEnabled() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setCheatItemsEnabled(boolean value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isBookmarkOverlayEnabled() {
		return true;
	}

	@Override
	public void toggleBookmarkEnabled() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setBookmarkEnabled(boolean value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getFilterText() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean setFilterText(String filterText) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void saveFilterText() {
		throw new UnsupportedOperationException();
	}
}
