/**
 * Constants that are global for all Jenkins.
 */
/* groovylint-disable DuplicateStringLiteral, DuplicateListLiteral, PropertyName */
/* groovylint-disable-next-line ClassJavadoc, CompileStatic */
class Constants {

    static final Map<String, String> ORGANIZATION_TYPES = [
        ONE: 'One',
        TWO: 'Two',
        THREE: 'Three',
        FOUR: 'Four',
        FIVE: 'Five'
    ]

    static final List<String> ORGANIZATION_TYPE_NAMES = ORGANIZATION_TYPES*.value

    static final List<String> ORGANIZATION_TYPES_REQUIRE_SAAS_ID = [
        ORGANIZATION_TYPES.ONE,
        ORGANIZATION_TYPES.TWO,
        ORGANIZATION_TYPES.THREE
    ]
}
