package crackingthecode;

@SuppressWarnings("unused")
public final class Chapter12SystemDesignAndMemoryLimits {
    /*
     * 12.1 - If you were integrating a feed of end of day stock price information (open, high, low,
     * and closing price) for 5,000 companies, how would you do it? You are responsible for the
     * development, rollout and ongoing monitoring and maintenance of the feed. De- scribe the
     * different methods you considered and why you would recommend your approach. The feed is
     * delivered once per trading day in a comma-separated format via an FTP site. The feed will be
     * used by 1000 daily users in a web application.
     */
    // Data - Company quote, open, high, low, closing x 5000
    // Not much data, easily can store into database and retrieved through JSON HTTP requests
    //    CREATE TABLE Stock
    //    (
    //        ID
    //        company VARCHAR(255),
    //        open FLOAT(8,4),
    //        high FLOAT(8,4),
    //        low FLOAT(8,4),
    //        closing FLOAT(8,4)
    //    );

    //    Example JSON
    //    {
    //       "stocks":[
    //          {
    //             "MSFT":[
    //                {
    //                   "company":"Microsoft",
    //                   "open":"42.56",
    //                   "high":"42.98",
    //                   "low":"42.49",
    //                   "closing":"42.49"
    //                }
    //             ]
    //          },
    //          {
    //             "GOOG":[
    //                {
    //                   "company":"Google",
    //                   "open":"561.65",
    //                   "high":"561.72",
    //                   "low":"559.05",
    //                   "closing":"557.99"
    //                }
    //             ]
    //          }
    //       ]
    //    }

    // The book mentions a "database" on Proposal 3 and "XML" data in Proposal 4.

    /*
     * 12.2 - How would you design the data structures for a very large social network (Facebook,
     * LinkedIn, etc)? Describe how you would design an algorithm to show the connec- tion, or path,
     * between two people (e.g., Me -> Bob -> Susan -> Jason -> You).
     */

    /*
     * 12.3 - Given an input file with four billion integers, provide an algorithm to generate an
     * integer which is not contained in the file. Assume you have 1 GB of memory.
     * FOLLOW UP
     * What if you have only 10 MB of memory?
     */
    // integers                     - 32bit
    // largest signed integer       - 2147483647 - 10^9 - 1000000000
    // largest unsigned integer     - 4294967295 - 10 bytes
    // 10 * 4000000000              - 4000000000
    // 4000000000B                  - 4000MB - 4GB
}
