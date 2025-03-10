/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.postgres.information_schema.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.postgres.information_schema.InformationSchema;
import org.jooq.meta.postgres.information_schema.Keys;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.routines</code>
     */
    public static final Routines ROUTINES = new Routines();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.routines.specific_catalog</code>.
     */
    public final TableField<Record, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.specific_schema</code>.
     */
    public final TableField<Record, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.specific_name</code>.
     */
    public final TableField<Record, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.routine_catalog</code>.
     */
    public final TableField<Record, String> ROUTINE_CATALOG = createField(DSL.name("routine_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.routine_schema</code>.
     */
    public final TableField<Record, String> ROUTINE_SCHEMA = createField(DSL.name("routine_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.routine_name</code>.
     */
    public final TableField<Record, String> ROUTINE_NAME = createField(DSL.name("routine_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.routine_type</code>.
     */
    public final TableField<Record, String> ROUTINE_TYPE = createField(DSL.name("routine_type"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.module_catalog</code>.
     */
    public final TableField<Record, String> MODULE_CATALOG = createField(DSL.name("module_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.module_schema</code>.
     */
    public final TableField<Record, String> MODULE_SCHEMA = createField(DSL.name("module_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.module_name</code>.
     */
    public final TableField<Record, String> MODULE_NAME = createField(DSL.name("module_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.udt_catalog</code>.
     */
    public final TableField<Record, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.udt_schema</code>.
     */
    public final TableField<Record, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.udt_name</code>.
     */
    public final TableField<Record, String> UDT_NAME = createField(DSL.name("udt_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.data_type</code>.
     */
    public final TableField<Record, String> DATA_TYPE = createField(DSL.name("data_type"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.routines.character_maximum_length</code>.
     */
    public final TableField<Record, Integer> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("character_maximum_length"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>information_schema.routines.character_octet_length</code>.
     */
    public final TableField<Record, Integer> CHARACTER_OCTET_LENGTH = createField(DSL.name("character_octet_length"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>information_schema.routines.character_set_catalog</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.character_set_schema</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.character_set_name</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.collation_catalog</code>.
     */
    public final TableField<Record, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.collation_schema</code>.
     */
    public final TableField<Record, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.collation_name</code>.
     */
    public final TableField<Record, String> COLLATION_NAME = createField(DSL.name("collation_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.numeric_precision</code>.
     */
    public final TableField<Record, Integer> NUMERIC_PRECISION = createField(DSL.name("numeric_precision"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>information_schema.routines.numeric_precision_radix</code>.
     */
    public final TableField<Record, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("numeric_precision_radix"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.routines.numeric_scale</code>.
     */
    public final TableField<Record, Integer> NUMERIC_SCALE = createField(DSL.name("numeric_scale"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.routines.datetime_precision</code>.
     */
    public final TableField<Record, Integer> DATETIME_PRECISION = createField(DSL.name("datetime_precision"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.routines.interval_type</code>.
     */
    public final TableField<Record, String> INTERVAL_TYPE = createField(DSL.name("interval_type"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.interval_precision</code>.
     */
    public final TableField<Record, Integer> INTERVAL_PRECISION = createField(DSL.name("interval_precision"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.routines.type_udt_catalog</code>.
     */
    public final TableField<Record, String> TYPE_UDT_CATALOG = createField(DSL.name("type_udt_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.type_udt_schema</code>.
     */
    public final TableField<Record, String> TYPE_UDT_SCHEMA = createField(DSL.name("type_udt_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.type_udt_name</code>.
     */
    public final TableField<Record, String> TYPE_UDT_NAME = createField(DSL.name("type_udt_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.scope_catalog</code>.
     */
    public final TableField<Record, String> SCOPE_CATALOG = createField(DSL.name("scope_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.scope_schema</code>.
     */
    public final TableField<Record, String> SCOPE_SCHEMA = createField(DSL.name("scope_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.scope_name</code>.
     */
    public final TableField<Record, String> SCOPE_NAME = createField(DSL.name("scope_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.maximum_cardinality</code>.
     */
    public final TableField<Record, Integer> MAXIMUM_CARDINALITY = createField(DSL.name("maximum_cardinality"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.routines.dtd_identifier</code>.
     */
    public final TableField<Record, String> DTD_IDENTIFIER = createField(DSL.name("dtd_identifier"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.routine_body</code>.
     */
    public final TableField<Record, String> ROUTINE_BODY = createField(DSL.name("routine_body"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.routine_definition</code>.
     */
    public final TableField<Record, String> ROUTINE_DEFINITION = createField(DSL.name("routine_definition"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.external_name</code>.
     */
    public final TableField<Record, String> EXTERNAL_NAME = createField(DSL.name("external_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.external_language</code>.
     */
    public final TableField<Record, String> EXTERNAL_LANGUAGE = createField(DSL.name("external_language"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.parameter_style</code>.
     */
    public final TableField<Record, String> PARAMETER_STYLE = createField(DSL.name("parameter_style"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.is_deterministic</code>.
     */
    public final TableField<Record, String> IS_DETERMINISTIC = createField(DSL.name("is_deterministic"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.routines.sql_data_access</code>.
     */
    public final TableField<Record, String> SQL_DATA_ACCESS = createField(DSL.name("sql_data_access"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.is_null_call</code>.
     */
    public final TableField<Record, String> IS_NULL_CALL = createField(DSL.name("is_null_call"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.routines.sql_path</code>.
     */
    public final TableField<Record, String> SQL_PATH = createField(DSL.name("sql_path"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.schema_level_routine</code>.
     */
    public final TableField<Record, String> SCHEMA_LEVEL_ROUTINE = createField(DSL.name("schema_level_routine"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column
     * <code>information_schema.routines.max_dynamic_result_sets</code>.
     */
    public final TableField<Record, Integer> MAX_DYNAMIC_RESULT_SETS = createField(DSL.name("max_dynamic_result_sets"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.routines.is_user_defined_cast</code>.
     */
    public final TableField<Record, String> IS_USER_DEFINED_CAST = createField(DSL.name("is_user_defined_cast"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column
     * <code>information_schema.routines.is_implicitly_invocable</code>.
     */
    public final TableField<Record, String> IS_IMPLICITLY_INVOCABLE = createField(DSL.name("is_implicitly_invocable"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.routines.security_type</code>.
     */
    public final TableField<Record, String> SECURITY_TYPE = createField(DSL.name("security_type"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.routines.to_sql_specific_catalog</code>.
     */
    public final TableField<Record, String> TO_SQL_SPECIFIC_CATALOG = createField(DSL.name("to_sql_specific_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.routines.to_sql_specific_schema</code>.
     */
    public final TableField<Record, String> TO_SQL_SPECIFIC_SCHEMA = createField(DSL.name("to_sql_specific_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.to_sql_specific_name</code>.
     */
    public final TableField<Record, String> TO_SQL_SPECIFIC_NAME = createField(DSL.name("to_sql_specific_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routines.as_locator</code>.
     */
    public final TableField<Record, String> AS_LOCATOR = createField(DSL.name("as_locator"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.routines.created</code>.
     */
    public final TableField<Record, Timestamp> CREATED = createField(DSL.name("created"), SQLDataType.TIMESTAMP(0), this, "");

    /**
     * The column <code>information_schema.routines.last_altered</code>.
     */
    public final TableField<Record, Timestamp> LAST_ALTERED = createField(DSL.name("last_altered"), SQLDataType.TIMESTAMP(0), this, "");

    /**
     * The column <code>information_schema.routines.new_savepoint_level</code>.
     */
    public final TableField<Record, String> NEW_SAVEPOINT_LEVEL = createField(DSL.name("new_savepoint_level"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.routines.is_udt_dependent</code>.
     */
    public final TableField<Record, String> IS_UDT_DEPENDENT = createField(DSL.name("is_udt_dependent"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_from_data_type</code>.
     */
    public final TableField<Record, String> RESULT_CAST_FROM_DATA_TYPE = createField(DSL.name("result_cast_from_data_type"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_as_locator</code>.
     */
    public final TableField<Record, String> RESULT_CAST_AS_LOCATOR = createField(DSL.name("result_cast_as_locator"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_char_max_length</code>.
     */
    public final TableField<Record, Integer> RESULT_CAST_CHAR_MAX_LENGTH = createField(DSL.name("result_cast_char_max_length"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_char_octet_length</code>.
     */
    public final TableField<Record, Integer> RESULT_CAST_CHAR_OCTET_LENGTH = createField(DSL.name("result_cast_char_octet_length"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_char_set_catalog</code>.
     */
    public final TableField<Record, String> RESULT_CAST_CHAR_SET_CATALOG = createField(DSL.name("result_cast_char_set_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_char_set_schema</code>.
     */
    public final TableField<Record, String> RESULT_CAST_CHAR_SET_SCHEMA = createField(DSL.name("result_cast_char_set_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_char_set_name</code>.
     */
    public final TableField<Record, String> RESULT_CAST_CHAR_SET_NAME = createField(DSL.name("result_cast_char_set_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_collation_catalog</code>.
     */
    public final TableField<Record, String> RESULT_CAST_COLLATION_CATALOG = createField(DSL.name("result_cast_collation_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_collation_schema</code>.
     */
    public final TableField<Record, String> RESULT_CAST_COLLATION_SCHEMA = createField(DSL.name("result_cast_collation_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_collation_name</code>.
     */
    public final TableField<Record, String> RESULT_CAST_COLLATION_NAME = createField(DSL.name("result_cast_collation_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_numeric_precision</code>.
     */
    public final TableField<Record, Integer> RESULT_CAST_NUMERIC_PRECISION = createField(DSL.name("result_cast_numeric_precision"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_numeric_precision_radix</code>.
     */
    public final TableField<Record, Integer> RESULT_CAST_NUMERIC_PRECISION_RADIX = createField(DSL.name("result_cast_numeric_precision_radix"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_numeric_scale</code>.
     */
    public final TableField<Record, Integer> RESULT_CAST_NUMERIC_SCALE = createField(DSL.name("result_cast_numeric_scale"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_datetime_precision</code>.
     */
    public final TableField<Record, Integer> RESULT_CAST_DATETIME_PRECISION = createField(DSL.name("result_cast_datetime_precision"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_interval_type</code>.
     */
    public final TableField<Record, String> RESULT_CAST_INTERVAL_TYPE = createField(DSL.name("result_cast_interval_type"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_interval_precision</code>.
     */
    public final TableField<Record, Integer> RESULT_CAST_INTERVAL_PRECISION = createField(DSL.name("result_cast_interval_precision"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_type_udt_catalog</code>.
     */
    public final TableField<Record, String> RESULT_CAST_TYPE_UDT_CATALOG = createField(DSL.name("result_cast_type_udt_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_type_udt_schema</code>.
     */
    public final TableField<Record, String> RESULT_CAST_TYPE_UDT_SCHEMA = createField(DSL.name("result_cast_type_udt_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_type_udt_name</code>.
     */
    public final TableField<Record, String> RESULT_CAST_TYPE_UDT_NAME = createField(DSL.name("result_cast_type_udt_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_scope_catalog</code>.
     */
    public final TableField<Record, String> RESULT_CAST_SCOPE_CATALOG = createField(DSL.name("result_cast_scope_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_scope_schema</code>.
     */
    public final TableField<Record, String> RESULT_CAST_SCOPE_SCHEMA = createField(DSL.name("result_cast_scope_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_scope_name</code>.
     */
    public final TableField<Record, String> RESULT_CAST_SCOPE_NAME = createField(DSL.name("result_cast_scope_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_maximum_cardinality</code>.
     */
    public final TableField<Record, Integer> RESULT_CAST_MAXIMUM_CARDINALITY = createField(DSL.name("result_cast_maximum_cardinality"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_dtd_identifier</code>.
     */
    public final TableField<Record, String> RESULT_CAST_DTD_IDENTIFIER = createField(DSL.name("result_cast_dtd_identifier"), SQLDataType.VARCHAR, this, "");

    private Routines(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Routines(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>information_schema.routines</code> table
     * reference
     */
    public Routines(String alias) {
        this(DSL.name(alias), ROUTINES);
    }

    /**
     * Create an aliased <code>information_schema.routines</code> table
     * reference
     */
    public Routines(Name alias) {
        this(alias, ROUTINES);
    }

    /**
     * Create a <code>information_schema.routines</code> table reference
     */
    public Routines() {
        this(DSL.name("routines"), null);
    }

    public <O extends Record> Routines(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, ROUTINES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.asList(Keys.ROUTINES__SYNTHETIC_FK_ROUTINES__SYNTHETIC_PK_SCHEMATA);
    }

    private transient Schemata _schemata;

    /**
     * Get the implicit join path to the
     * <code>information_schema.schemata</code> table.
     */
    public Schemata schemata() {
        if (_schemata == null)
            _schemata = new Schemata(this, Keys.ROUTINES__SYNTHETIC_FK_ROUTINES__SYNTHETIC_PK_SCHEMATA);

        return _schemata;
    }

    @Override
    public Routines as(String alias) {
        return new Routines(DSL.name(alias), this);
    }

    @Override
    public Routines as(Name alias) {
        return new Routines(alias, this);
    }

    @Override
    public Routines as(Table<?> alias) {
        return new Routines(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Routines rename(String name) {
        return new Routines(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Routines rename(Name name) {
        return new Routines(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Routines rename(Table<?> name) {
        return new Routines(name.getQualifiedName(), null);
    }
}
