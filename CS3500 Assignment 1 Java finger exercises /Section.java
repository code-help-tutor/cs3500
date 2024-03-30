WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package cs3500.hw01.ebooks;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

/**
 * A Section of an e-book consists of a section title, followed by
 * a sequence of e-book chunks (which could be paragraphs, sub-sections, etc.)
 */
public class Section implements EBookChunk {
  private final String title;
  private final List<EBookChunk> contents;

  public Section(String title, List<EBookChunk> contents) {
    this.title = Objects.requireNonNull(title);
    if (title.contains("\n")) {
      throw new IllegalArgumentException("Titles cannot contain line breaks");
    }
    this.contents = new ArrayList<>(Objects.requireNonNull(contents));
  }

  public int countWords() {
    return this.contents.size() + this.title.split(" ").length;
  }

  public boolean contains(String word) {
    if (word == null) { throw new IllegalArgumentException("Invalid word"); }
    return this.title.contains(word) ||
      this.contents.stream().anyMatch(c -> c.contains(word));
  }
}
