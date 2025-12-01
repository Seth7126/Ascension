// 函数: _ZN26CReliableTCPConnectionIPV67ConnectEPKci
// 地址: 0xbb750
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

struct addrinfo* r7 = nullptr
int32_t r0 = *__stack_chk_guard
arg1[0x18] = 0
*(arg1 + 4) = 0xffffffff
char var_450[0x20]
sprintf(&var_450, "%d")
int32_t var_4e4
__builtin_memset(&var_4e4, 0, 0x14)
int32_t var_4ec = 0
int32_t __req = 0
int32_t var_4e8 = 1
struct addrinfo* var_4f4

if (getaddrinfo(arg2, &var_450, &__req, &var_4f4) == 0)
    struct addrinfo* r9_1 = var_4f4
    int32_t var_4d0
    int32_t __host
    
    if (r9_1 != 0)
        char const* const r5_1 = "localhost"
        
        if (arg2 != 0)
            r5_1 = arg2
        
        while (true)
            int32_t __domain = r9_1->__offset(0x4).d
            
            if ((__domain | 8) == 0xa && r9_1->__offset(0x8).d == 1)
                int32_t r0_4 = socket(__domain, 1, r9_1->__offset(0xc).d)
                
                if (r0_4 == 0xffffffff)
                    puts("Error Opening socket, error")
                else
                    var_4d0 = 1
                    setsockopt(r0_4, 6, 1, &var_4d0, 4)
                    printf("Attempting to connect to: %s\n", r5_1)
                    
                    if (connect(r0_4, r9_1->__offset(0x18).d, r9_1->__offset(0x10).d) != 0xffffffff)
                        *(arg1 + 4) = r0_4
                        r7 = r9_1
                        break
                    
                    if (getnameinfo(r9_1->__offset(0x18).d, r9_1->__offset(0x10).d, &__host, 0x401, 
                            nullptr, 0, 2) != 0)
                        __builtin_strcpy(&__host, "<unknown>")
                    
                    printf("connect() to %s failed\n", &__host)
                    close(r0_4)
            
            r9_1 = r9_1->__offset(0x1c).d
            
            if (r9_1 == 0)
                r7 = nullptr
                break
    
    socklen_t var_4f8 = 0x80
    int16_t var_4ce
    
    if (getpeername(*(arg1 + 4), &var_4d0, &var_4f8) == 0xffffffff)
        puts("getpeername() failed")
    else
        if (getnameinfo(&var_4d0, var_4f8, &__host, 0x401, nullptr, 0, 2) != 0)
            __builtin_strcpy(&__host, "<unknown>")
        
        char const* const r6_1 = "PF_INET6"
        
        if ((r7 + 4)->__offset(0x0).d == 2)
            r6_1 = "PF_INET"
        
        uint32_t r1_9 = zx.d(var_4ce)
        void* const r3_2 = &data_1bfcf7
        
        if ((r7 + 4)->__offset(0x4).d != 1)
            r3_2 = &data_1bfcfb
        
        printf("Connected to %s, port %d, protocol %s, protocol family %s\n", &__host, 
            ror.w(r1_9 u>> 0x10, 0x10) << 0x10 | ror.w(r1_9.w, 0x10), r3_2, r6_1)
    
    freeaddrinfo(var_4f4)
    var_4f8 = 0x80
    
    if (getsockname(*(arg1 + 4), &var_4d0, &var_4f8) == 0xffffffff)
        puts("getsockname() failed")
    else
        if (getnameinfo(&var_4d0, var_4f8, &__host, 0x401, nullptr, 0, 2) != 0)
            __builtin_strcpy(&__host, "<unknown>")
        
        uint32_t r1_13 = zx.d(var_4ce)
        printf("Using local address %s, port %d\n", &__host, 
            ror.w(r1_13 u>> 0x10, 0x10) << 0x10 | ror.w(r1_13.w, 0x10))

int32_t r0_20 = *(arg1 + 4)

if (r0_20 == 0xffffffff)
    if (*__errno(r0_20) == 0x73)
        arg1[0x19] = 1
else
    (**arg1)(arg1)
    arg1[0x18] = 1

int32_t r0_25 = *__stack_chk_guard

if (r0_25 == r0)
    return r0_25 - r0

__stack_chk_fail()
noreturn
