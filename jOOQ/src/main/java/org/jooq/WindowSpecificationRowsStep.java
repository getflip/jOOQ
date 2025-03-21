/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: https://www.jooq.org/legal/licensing
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq;

// ...
// ...
// ...
// ...
// ...
import static org.jooq.SQLDialect.FIREBIRD;
import static org.jooq.SQLDialect.H2;
// ...
import static org.jooq.SQLDialect.MARIADB;
// ...
import static org.jooq.SQLDialect.MYSQL;
// ...
// ...
import static org.jooq.SQLDialect.POSTGRES;
// ...
// ...
// ...
// ...
import static org.jooq.SQLDialect.SQLITE;
// ...
// ...
// ...
// ...
import static org.jooq.SQLDialect.TRINO;
// ...
import static org.jooq.SQLDialect.YUGABYTEDB;

import org.jetbrains.annotations.NotNull;

/**
 * An intermediate step in the construction of a {@link WindowSpecification}.
 * <p>
 * Example: <pre><code>
 * WindowSpecification spec =
 * DSL.partitionBy(BOOK.AUTHOR_ID)
 *    .orderBy(BOOK.ID)
 *    .rowsBetweenUnboundedPreceding()
 *    .andCurrentRow();
 * </code></pre>
 * <p>
 * <h3>Referencing <code>XYZ*Step</code> types directly from client code</h3>
 * <p>
 * It is usually not recommended to reference any <code>XYZ*Step</code> types
 * directly from client code, or assign them to local variables. When writing
 * dynamic SQL, creating a statement's components dynamically, and passing them
 * to the DSL API statically is usually a better choice. See the manual's
 * section about dynamic SQL for details: <a href=
 * "https://www.jooq.org/doc/latest/manual/sql-building/dynamic-sql">https://www.jooq.org/doc/latest/manual/sql-building/dynamic-sql</a>.
 * <p>
 * Drawbacks of referencing the <code>XYZ*Step</code> types directly:
 * <ul>
 * <li>They're operating on mutable implementations (as of jOOQ 3.x)</li>
 * <li>They're less composable and not easy to get right when dynamic SQL gets
 * complex</li>
 * <li>They're less readable</li>
 * <li>They might have binary incompatible changes between minor releases</li>
 * </ul>
 *
 * @author Lukas Eder
 */
public interface WindowSpecificationRowsStep extends WindowSpecificationFinalStep {

    /**
     * Add a <code>ROWS UNBOUNDED PRECEDING</code> frame clause to the window
     * specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationExcludeStep rowsUnboundedPreceding();

    /**
     * Add a <code>ROWS [number] PRECEDING</code> frame clause to the window
     * specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationExcludeStep rowsPreceding(int number);

    /**
     * Add a <code>ROWS CURRENT ROW</code> frame clause to the window
     * specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationExcludeStep rowsCurrentRow();

    /**
     * Add a <code>ROWS UNBOUNDED FOLLOWING</code> frame clause to the window
     * specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationExcludeStep rowsUnboundedFollowing();

    /**
     * Add a <code>ROWS [number] FOLLOWING</code> frame clause to the window
     * specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationExcludeStep rowsFollowing(int number);

    /**
     * Add a <code>ROWS BETWEEN UNBOUNDED PRECEDING …</code> frame clause to
     * the window specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationRowsAndStep rowsBetweenUnboundedPreceding();

    /**
     * Add a <code>ROWS BETWEEN [number] PRECEDING …</code> frame clause to
     * the window specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationRowsAndStep rowsBetweenPreceding(int number);

    /**
     * Add a <code>ROWS BETWEEN CURRENT ROW …</code> frame clause to the
     * window specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationRowsAndStep rowsBetweenCurrentRow();

    /**
     * Add a <code>ROWS BETWEEN UNBOUNDED FOLLOWING …</code> frame clause to
     * the window specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationRowsAndStep rowsBetweenUnboundedFollowing();

    /**
     * Add a <code>ROWS BETWEEN [number] FOLLOWING …</code> frame clause to
     * the window specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationRowsAndStep rowsBetweenFollowing(int number);

    /**
     * Add a <code>RANGE UNBOUNDED PRECEDING</code> frame clause to the window
     * specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationExcludeStep rangeUnboundedPreceding();

    /**
     * Add a <code>RANGE [number] PRECEDING</code> frame clause to the window
     * specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationExcludeStep rangePreceding(int number);

    /**
     * Add a <code>RANGE CURRENT ROW</code> frame clause to the window
     * specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationExcludeStep rangeCurrentRow();

    /**
     * Add a <code>RANGE UNBOUNDED FOLLOWING</code> frame clause to the window
     * specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationExcludeStep rangeUnboundedFollowing();

    /**
     * Add a <code>RANGE [number] FOLLOWING</code> frame clause to the window
     * specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationExcludeStep rangeFollowing(int number);

    /**
     * Add a <code>RANGE BETWEEN UNBOUNDED PRECEDING …</code> frame clause to
     * the window specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationRowsAndStep rangeBetweenUnboundedPreceding();

    /**
     * Add a <code>RANGE BETWEEN [number] PRECEDING …</code> frame clause to
     * the window specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationRowsAndStep rangeBetweenPreceding(int number);

    /**
     * Add a <code>RANGE BETWEEN CURRENT ROW …</code> frame clause to the
     * window specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationRowsAndStep rangeBetweenCurrentRow();

    /**
     * Add a <code>RANGE BETWEEN UNBOUNDED FOLLOWING …</code> frame clause to
     * the window specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationRowsAndStep rangeBetweenUnboundedFollowing();

    /**
     * Add a <code>RANGE BETWEEN [number] FOLLOWING …</code> frame clause to
     * the window specification.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationRowsAndStep rangeBetweenFollowing(int number);

    /**
     * Add a <code>GROUPS UNBOUNDED PRECEDING</code> frame clause to the window
     * specification.
     */
    @NotNull
    @Support({ H2, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationExcludeStep groupsUnboundedPreceding();

    /**
     * Add a <code>GROUPS [number] PRECEDING</code> frame clause to the window
     * specification.
     */
    @NotNull
    @Support({ H2, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationExcludeStep groupsPreceding(int number);

    /**
     * Add a <code>GROUPS CURRENT ROW</code> frame clause to the window
     * specification.
     */
    @NotNull
    @Support({ H2, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationExcludeStep groupsCurrentRow();

    /**
     * Add a <code>GROUPS UNBOUNDED FOLLOWING</code> frame clause to the window
     * specification.
     */
    @NotNull
    @Support({ H2, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationExcludeStep groupsUnboundedFollowing();

    /**
     * Add a <code>GROUPS [number] FOLLOWING</code> frame clause to the window
     * specification.
     */
    @NotNull
    @Support({ H2, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationExcludeStep groupsFollowing(int number);

    /**
     * Add a <code>GROUPS BETWEEN UNBOUNDED PRECEDING …</code> frame clause to
     * the window specification.
     */
    @NotNull
    @Support({ H2, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationRowsAndStep groupsBetweenUnboundedPreceding();

    /**
     * Add a <code>GROUPS BETWEEN [number] PRECEDING …</code> frame clause to
     * the window specification.
     */
    @NotNull
    @Support({ H2, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationRowsAndStep groupsBetweenPreceding(int number);

    /**
     * Add a <code>GROUPS BETWEEN CURRENT ROW …</code> frame clause to the
     * window specification.
     */
    @NotNull
    @Support({ H2, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationRowsAndStep groupsBetweenCurrentRow();

    /**
     * Add a <code>GROUPS BETWEEN UNBOUNDED FOLLOWING …</code> frame clause to
     * the window specification.
     */
    @NotNull
    @Support({ H2, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationRowsAndStep groupsBetweenUnboundedFollowing();

    /**
     * Add a <code>GROUPS BETWEEN [number] FOLLOWING …</code> frame clause to
     * the window specification.
     */
    @NotNull
    @Support({ H2, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowSpecificationRowsAndStep groupsBetweenFollowing(int number);
}
