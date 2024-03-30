WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package cs3500.hw01.ebooks;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

/**
 * A Paragraph of an e-book consists of a chunk of plain text.
 */
public class Paragraph implements EBookChunk {
  private final List<EBookFlow> contents;

  public Paragraph(List<EBookFlow> contents) {
    validateContents(contents);
    this.contents = new ArrayList<>(contents);
  }

  private static void validateContents(List<EBookFlow> content) {
    if (content == null) {
      throw new IllegalArgumentException("Contentlist cannot be null");
    }
    if (content.stream().anyMatch(c -> c == null)) {
      throw new IllegalArgumentException("Content list cannot contain null content");
    }
  }


  public int countWords() {
    return this.contents.stream().mapToInt(c -> c.countWords()).sum();
  }

  public boolean contains(String word) {
    return this.contents.stream().anyMatch(c -> c.contains(word));
  }
}
