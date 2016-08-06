package crackingthecode.part3knowledgebased;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
@SuppressWarnings("unused")
public class Chapter17Networking {

    /**
     * 17.1 - Explain what happens, step by step, after you type a URL into a browser. Use as much
     * detail as possible.
     */
    // DNS - Domain Name Resolution
    // Type URL and hit enter/go
    // Browser contacts DNS server for IP address of website
    // DNS returns IP address of website
    // Browser opens TCP connection to the web server via port 80
    // Browser fetches the HTML
    // Browser caches data
    // Browser renders the fetched HTML
    // Browser caches data
    // Connections are terminated when browser is closed or navigated away from site

    /**
     * 17.2 - Explain any common routing protocol in detail. For example: BGP, OSPF, RIP.
     */
    // BGP - Border Gateway Protocol - Download and update routing tables. BGP routers send and
    // receive update messages to indicate a change in the preferred path to reach a computer with
    // a given IP address.
    // http://www.livinginternet.com/i/iw_route_egp_bgp.htm

    // RIP - Routing Information Protocol - RIP provides the standard IGP protocol for local area
    // networks, and provides great network stability, guaranteeing that if one network connection
    // goes down the network can quickly adapt to send packets through another connection.
    // RIP only keeps track of the closest router for each destination address.
    // http://www.livinginternet.com/i/iw_route_igp_rip.htm

    // OSPF - Open Shortest Path First - Open Shortest Path First (OSPF) is a particularly efficient
    // IGP routing protocol that is faster than RIP, but also more complex.
    // OSPF keeps track of a complete topological database of all connections in the local network.

    // Startup - Send hello to children and gets routing tables for synchronized routing connections.
    // Update - At regular intervals the router sends out messages to other routers about it's table.
    // Shortest Path Tree - Each router generates the shortest path to each destination address and
    // identifies the closest router for communication.
    // http://www.livinginternet.com/i/iw_route_igp_ospf.htm

    /**
     * 17.3 - Compare and contrast the IPv4 and IPv6 protocols.
     */
    // http://www.networkworld.com/article/2692482/ipv6/infographic-ipv4-vs-ipv6.html
    // IPv4 - 4,294,967,296 addresses,  IPv6 - 340 trillion trillion trillion addresses
    // IPv4 - Not enough devices,       IPv6 - 340,000,000,000,000,000,000,000,000,000,000,000,000
    // IPv4 - 32bit,                    IPv6 - 128bit
    // IPv4 - share ip addresses,       IPv6 - each person/device could have billions
    // IPv4 - complex header,           IPv6 - less complex header
    // IPv4 - binary address,           IPv6 - hexadecimal address
    // IPv4 - Class A-E,                IPv6 - Unicast, Multlicast, Anycast
    // IPv6 Advantages
    // 1. Increased address space
    // 2. More efficient routing
    // 3. Reduced management requirement
    // 4. Improved methods to change ISP
    // 5. Better mobility support
    // 6. Multi-homing
    // 7. Scoped address: link-local, site-local and global-address space

    /**
     * 17.4 - What is a network / subnet mask? Explain how host A sends a message / packet to host
     * B when: (a) both are on same network and (b) both are on different networks. Explain which
     * layer makes the routing decision and how.
     */
    // http://www.aelius.com/njh/subnet_sheet.html
    // Network/Subnet mask - A mask is a bit pattern used to identify the network/subnet address.
    // Example: Consider IP address 152.210.011.002. This address belongs to Class B, so:
    //      Network Mask: 11111111.11111111.00000000.00000000
    //      Given Address: 10011000.11010101.00001011.00000010
    // By ANDing Network Mask and IP Address, we get the following network address:
    //      10011000.11010101.00000000.00000000 (152.210.0.0)
    //      Host address: 00001011.00000010
    // Range of IP addresses - eg. 192.1.168.0/24 -> 254 hosts, netmask 255.255.255.0
    // A) The host address bits are used to identify the host within the network.
    // B) The router uses the network mask to identify the network and route the packet. The host
    // can be identified using the network host address.
    // The Network Layer is the layer out of (1. Physical, 2. Data Link, 3. Network, 4. Transport,
    // 5. Session, 6. Presentation, 7. Application) handles the routing and forwarding of packets.

    /**
     * 17.5 - What are the differences between TCP and UDP? Explain how TCP handles reliable
     * delivery (explain ACK mechanism), flow control (explain TCP sender’s / receiver’s win- dow)
     * and congestion control.
     */
    // TCP(Transmission Control Protocol) - handshake, logins
    //      Reliable - when you send a message along a TCP socket, you know it will get there unless
    //      the connection fails completely. If it gets lost along the way, the server will
    //      re-request the lost part. This means complete integrity; data will not get corrupted.
    //      Ordered - if you send two messages along a connection, one after the other, you know the
    //      first message will get there first. You don’t have to worry about data arriving in the
    //      wrong order.
    //      Heavyweight - when the low level parts of the TCP “stream” arrive in the wrong order,
    //      re- send requests have to be sent. All the out of sequence parts must be put back
    //      together, which requires a bit of work.
    // UDP(User Datagram Protocol) - media, no response check if data successfully arrived
    //      Unreliable - When you send a message, you don’t know if it’ll get there; it could get
    //      lost on the way.
    //      Not ordered - If you send two messages out, you don’t know what order they’ll arrive in.
    //      Lightweight - No ordering of messages, no tracking connections, etc. It’s just fire and
    //      forget! This means it’s a lot quicker, and the network card / OS have to do very little
    //      work to translate the data back from the packets.

    // Reliable Delivery
    // For each TCP packet, the receiver of a packet must acknowledge that the packet is received.
    // If there is no acknowledgement, the packet is sent again. ACK is a packet used in TCP to
    // acknowledge receipt of a packet. A TCP window is the amount of outstanding (unacknowledged by
    // the recipient) data a sender can send on a particular connection before it gets an
    // acknowledgment back from the receiver that it has gotten some of it.

    // Congestion Control
    // The TCP uses a network congestion avoidance algorithm that includes various aspects of an
    // additive-increase-multiplicative-decrease scheme, with other schemes such as slow-start in
    // order to achieve congestion avoidance.

    // Tahoe and Reno
    // For each connection, TCP maintains a congestion window, limiting the total number of
    // unacknowledged packets
    // Although the initial rate is low, the rate of increase is very rapid: for every packet
    // acknowledged, the congestion window increases by 1 MSS so that for every round trip time
    // (RTT), the congestion window has doubled.
    // When the congestion window exceeds a threshold ssthresh the algorithm enters a new state,
    // called congestion avoidance. Linux has a large starting window.
}
