package org.apache.hadoop.tools;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.security.Credentials;

import java.io.IOException;

/**
 * Linenant Simple Copy Listing which does not do any duplicate paths
 * if input paths contain /a/b/c.txt and /a/d/c.txt then it it's allowed
 */
public class LinenantSimpleCopyListing extends SimpleCopyListing{
  /**
   * Protected constructor, to initialize configuration.
   *
   * @param configuration: The input configuration, with which the source/target FileSystems may be accessed.
   * @param credentials    - Credentials object on which the FS delegation tokens are cached. If null
   *                       delegation token caching is skipped
   */
  protected LinenantSimpleCopyListing(Configuration configuration, Credentials credentials) {
    super(configuration, credentials);
  }

  @Override
  protected void checkForDuplicates(Path pathToListFile) throws DuplicateFileException, IOException {

  }
}
