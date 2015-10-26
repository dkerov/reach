package edu.arizona.sista.reach.grounding2

/**
  * Class holding information about a specific resolution from the in-memory Knowledge Base.
  *   Written by: Tom Hicks. 10/25/2015.
  *   Last Modified: Intial creation: extend KB entry, encapsulate KB meta info.
  */
class KBResolution (

  /** Meta information about the KB from which this resolution was created. */
  val metaInfo: KBMetaInfo,

  // fields declared in KBEntry:
  text: String,
  key: String,
  id: String,
  species: Option[String] = None,
  alternateIds: Option[Set[String]] = None,
  standardName: Option[String] = None

) extends KBEntry(text, key, id, species, alternateIds, standardName) {

  /** Constructor which takes a KBMetaInfo and KBEntry to initialize resolution fields. */
  def this(metaInfo:KBMetaInfo, ent:KBEntry) =
    this(metaInfo, ent.text, ent.key, ent.id, ent.species, ent.alternateIds, ent.standardName)

}
