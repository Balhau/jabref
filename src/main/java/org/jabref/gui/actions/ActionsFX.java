package org.jabref.gui.actions;

import java.util.Optional;

import javax.swing.AbstractAction;
import javax.swing.Action;

import org.jabref.Globals;
import org.jabref.gui.IconTheme;
import org.jabref.gui.JabRefFrame;
import org.jabref.gui.JabRefIcon;
import org.jabref.gui.keyboard.KeyBinding;
import org.jabref.logic.l10n.Localization;
import org.jabref.model.database.BibDatabaseMode;

public enum ActionsFX {

    COPY_MORE(Localization.lang("Copy") + "..."),
    COPY_TITLE(Localization.lang("Copy title"), KeyBinding.COPY_TITLE),
    COPY_KEY(Localization.lang("Copy BibTeX key"), KeyBinding.COPY_BIBTEX_KEY),
    COPY_CITE_KEY(Localization.lang("Copy \\cite{BibTeX key}"), KeyBinding.COPY_CITE_BIBTEX_KEY),
    COPY_KEY_AND_TITLE(Localization.lang("Copy BibTeX key and title"), KeyBinding.COPY_BIBTEX_KEY_AND_TITLE),
    COPY_KEY_AND_LINK(Localization.lang("Copy BibTeX key and link"), KeyBinding.COPY_BIBTEX_KEY_AND_LINK),
    COPY_CITATION_HTML(Localization.menuTitle("Copy citation") + " (HTML)", KeyBinding.COPY_PREVIEW),
    COPY_CITATION_MORE(Localization.menuTitle("Copy citation") + "..."),
    COPY_CITATION_TEXT("Text"),
    COPY_CITATION_RTF("RTF"),
    COPY_CITATION_ASCII_DOC("AsciiDoc"),
    COPY_CITATION_XSLFO("XSL-FO"),
    COPY_CITATION_PREVIEW(Localization.lang("Copy preview"), KeyBinding.COPY_PREVIEW),
    EXPORT_TO_CLIPBOARD(Localization.lang("Export to clipboard"), IconTheme.JabRefIcons.EXPORT_TO_CLIPBOARD),
    COPY(Localization.lang("Copy"), IconTheme.JabRefIcons.COPY, KeyBinding.COPY),
    PASTE(Localization.lang("Paste"), IconTheme.JabRefIcons.PASTE, KeyBinding.PASTE),
    CUT(Localization.lang("Cut"), IconTheme.JabRefIcons.CUT, KeyBinding.CUT),
    DELETE(Localization.lang("Delete"), IconTheme.JabRefIcons.DELETE_ENTRY, KeyBinding.DELETE_ENTRY),
    SEND_AS_EMAIL(Localization.lang("Send as email"), IconTheme.JabRefIcons.EMAIL),
    OPEN_FOLDER(Localization.lang("Open folder"), KeyBinding.OPEN_FOLDER),
    OPEN_EXTERNAL_FILE(Localization.lang("Open file"), IconTheme.JabRefIcons.FILE, KeyBinding.OPEN_FILE),
    OPEN_URL(Localization.lang("Open URL or DOI"), IconTheme.JabRefIcons.WWW, KeyBinding.OPEN_URL_OR_DOI),
    MERGE_WITH_FETCHED_ENTRY(Localization.lang("Get BibTeX data from %0", "DOI/ISBN/...")),
    ADD_FILE_LINK(Localization.lang("Attach file"), IconTheme.JabRefIcons.ATTACH_FILE),
    MERGE_ENTRIES(Localization.lang("Merge entries") + "...", IconTheme.JabRefIcons.MERGE_ENTRIES),
    ADD_TO_GROUP(Localization.lang("Add to group")),
    REMOVE_FROM_GROUP(Localization.lang("Remove from group")),
    MOVE_TO_GROUP(Localization.lang("Move to group")),
    PRIORITY(Localization.lang("Priority"), IconTheme.JabRefIcons.PRIORITY),
    CLEAR_PRIORITY(Localization.lang("Clear priority")),
    PRIORITY_HIGH(Localization.lang("Set priority to high"), IconTheme.JabRefIcons.PRIORITY_HIGH),
    PRIORITY_MEDIUM(Localization.lang("Set priority to medium"), IconTheme.JabRefIcons.PRIORITY_MEDIUM),
    PRIORITY_LOW(Localization.lang("Set priority to low"), IconTheme.JabRefIcons.PRIORITY_LOW),
    QUALITY(Localization.lang("Quality"), IconTheme.JabRefIcons.QUALITY),
    QUALITY_ASSURED(Localization.lang("Toggle quality assured"), IconTheme.JabRefIcons.QUALITY_ASSURED),
    RANKING(Localization.lang("Rank"), IconTheme.JabRefIcons.RANKING),
    CLEAR_RANK(Localization.lang("Clear rank")),
    RANK_1("", IconTheme.JabRefIcons.RANK1),
    RANK_2("", IconTheme.JabRefIcons.RANK2),
    RANK_3("", IconTheme.JabRefIcons.RANK3),
    RANK_4("", IconTheme.JabRefIcons.RANK4),
    RANK_5("", IconTheme.JabRefIcons.RANK5),
    PRINTED(Localization.lang("Printed"), IconTheme.JabRefIcons.PRINTED),
    TOGGLE_PRINTED(Localization.lang("Toggle print status"), IconTheme.JabRefIcons.PRINTED),
    READ_STATUS(Localization.lang("Read status"), IconTheme.JabRefIcons.READ_STATUS),
    CLEAR_READ_STATUS(Localization.lang("Clear read status")),
    READ(Localization.lang("Set read status to read"), IconTheme.JabRefIcons.READ_STATUS_READ),
    SKIMMED(Localization.lang("Set read status to skimmed"), IconTheme.JabRefIcons.READ_STATUS_SKIMMED),
    RELEVANCE(Localization.lang("Relevance"), IconTheme.JabRefIcons.RELEVANCE),
    RELEVANT(Localization.lang("Toggle relevance"), IconTheme.JabRefIcons.RELEVANCE),
    NEW_LIBRARY_BIBTEX(Localization.menuTitle("New %0 library", BibDatabaseMode.BIBTEX.getFormattedName()), IconTheme.JabRefIcons.NEW),
    NEW_LIBRARY_BIBLATEX(Localization.menuTitle("New %0 library", BibDatabaseMode.BIBLATEX.getFormattedName()), IconTheme.JabRefIcons.NEW),
    OPEN_LIBRARY(Localization.menuTitle("Open library"), IconTheme.JabRefIcons.OPEN, KeyBinding.OPEN_DATABASE),
    mergeDatabaseAction(Localization.menuTitle("Append library"), Localization.lang("Append contents from a BibTeX library into the currently viewed library")),
    save(Localization.menuTitle("Save library"), IconTheme.JabRefIcons.SAVE, KeyBinding.SAVE_DATABASE),
    private final AbstractAction saveAs = new JabRefFrame.GeneralAction(Actions.SAVE_AS,
            Localization.menuTitle("Save library as..."), Localization.lang("Save library as..."),
            Globals.getKeyPrefs().getKey(KeyBinding.SAVE_DATABASE_AS));
    private final AbstractAction saveSelectedAsPlain = new JabRefFrame.GeneralAction(Actions.SAVE_SELECTED_AS_PLAIN,
            Localization.menuTitle("Save selected as plain BibTeX..."),
            Localization.lang("Save selected as plain BibTeX..."));)
    private final String description;.

    saveAll(super(IconTheme.JabRefIcons.SAVE_ALL.getIcon())

    putValue(Action.ACCELERATOR_KEY, Globals.getKeyPrefs())

    getKey(KeyBinding.SAVE_ALL)))

    putValue(Action.SHORT_DESCRIPTION, Localization.lang("Save all open libraries")

    putValue(Action.NAME, Localization.menuTitle("Save all"))

    importNew(putValue(Action.NAME, Localization.menuTitle("Import into new library").

    putValue(Action.ACCELERATOR_KEY, Globals.getKeyPrefs()))

    getKey(KeyBinding.IMPORT_INTO_NEW_DATABASE))

    importCurrent(putValue(Action.NAME, Localization.menuTitle("Import into current library").

    putValue(Action.ACCELERATOR_KEY,
             Globals.getKeyPrefs()))


    private final String text;

    getKey(KeyBinding.IMPORT_INTO_CURRENT_DATABASE)
    private final Optional<JabRefIcon> icon;
    private final Optional<KeyBinding> keyBinding;

    ActionsFX(String text) {
        this("", "");
    }

    ActionsFX(String text, IconTheme.JabRefIcons icon) {
        this.text = text;
        this.description = "";
        this.icon = Optional.of(icon);
        this.keyBinding = Optional.empty();
    }

    ActionsFX(String text, IconTheme.JabRefIcons icon, KeyBinding keyBinding) {
        this.text = text;
        this.description = "";
        this.icon = Optional.of(icon);
        this.keyBinding = Optional.of(keyBinding);
    }

    ActionsFX(String text, KeyBinding keyBinding) {
        this.text = text;
        this.description = "";
        this.keyBinding = Optional.of(keyBinding);
        this.icon = Optional.empty();
    }

    ActionsFX(String text, String description) {
        this.text = text;
        this.description = description;
        this.icon = Optional.empty();
        this.keyBinding = Optional.empty();
    }

    public Optional<JabRefIcon> getIcon() {
        return icon;
    }

    public Optional<KeyBinding> getKeyBinding() {
        return keyBinding;
    }

    public String getText() {
        return text;
    }

    public String getDescription() {
        return description;
    }
}