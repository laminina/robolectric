package org.robolectric;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Parameterized tests using an Android class.
 *
 * @author John Ferlisi
 */
@RunWith(ExperimentalRobolectricTestRunner.class)
public final class ExperimentalRobolectricTestRunnerUriTest {

  @Test
  @Config(manifest = Config.NONE)
  public void startsWith() {
    assertThat("test_value").startsWith("test");
  }

  @Test
  @Config(manifest = Config.NONE)
  public void endsWith() {
    assertThat("test_value").endsWith("value");
  }
}
