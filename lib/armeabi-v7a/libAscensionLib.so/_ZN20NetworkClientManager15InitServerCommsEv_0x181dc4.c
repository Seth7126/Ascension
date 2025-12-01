// 函数: _ZN20NetworkClientManager15InitServerCommsEv
// 地址: 0x181dc4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t r1 = *(entry_r0 + 0xd0)
int32_t* r2 = *(entry_r0 + 0xd4)
*(entry_r0 + 0x94) = 0
*(entry_r0 + 0x8d) = 0

while (r1 != r2)
    r2 -= 4
    void* r0 = *r2
    *(entry_r0 + 0xd4) = r2
    
    if (r0 != 0)
        operator delete(r0)
        r1 = *(entry_r0 + 0xd0)
        r2 = *(entry_r0 + 0xd4)

int32_t r0_1 = *(entry_r0 + 0x514)
int32_t r1_1 = *(entry_r0 + 0x518)

if (r1_1 != r0_1)
    int32_t r5_1 = (r1_1 - r0_1) s>> 2
    int32_t r6_1 = 0
    
    while (true)
        void* r0_2 = *(r0_1 + (r6_1 << 2))
        
        if (r0_2 != 0)
            operator delete(r0_2)
        
        r6_1 += 1
        
        if (r6_1 u>= r5_1)
            break
        
        r0_1 = *(entry_r0 + 0x514)
    
    r0_1 = *(entry_r0 + 0x514)

int32_t r2_1 = *(entry_r0 + 0xdc)
int32_t i = *(entry_r0 + 0xe0)
*(entry_r0 + 0x518) = r0_1

if (r2_1 != i)
    do
        int32_t r2_2 = *(entry_r0 + 0x500)
        int32_t* r1_3 = i - 4
        void* r5_2 = *r1_3
        
        if (r2_2 != 0)
            r2_2(*(entry_r0 + 0x504), r5_2)
            r1_3 = *(entry_r0 + 0xe0) - 4
        
        *(entry_r0 + 0xe0) = r1_3
        ClearAppWorldData(r5_2)
        
        if (r5_2 != 0)
            operator delete(r5_2)
        
        i = *(entry_r0 + 0xe0)
    while (*(entry_r0 + 0xdc) != i)

while (true)
    int32_t r0_9 = *(entry_r0 + 0xec)
    
    if (*(entry_r0 + 0xe8) == r0_9)
        break
    
    AppWorldData* r5_3 = *(r0_9 - 4)
    *(entry_r0 + 0xec) = r0_9 - 4
    ClearAppWorldData(r5_3)
    
    if (r5_3 != 0)
        operator delete(r5_3)

while (true)
    int32_t r0_13 = *(entry_r0 + 0xf8)
    
    if (*(entry_r0 + 0xf4) == r0_13)
        break
    
    AppWorldData* r5_4 = *(r0_13 - 4)
    *(entry_r0 + 0xf8) = r0_13 - 4
    ClearAppWorldData(r5_4)
    
    if (r5_4 != 0)
        operator delete(r5_4)

char* r0_16 = operator new(0x82c)
CReliableTCPConnectionIPV6::CReliableTCPConnectionIPV6()
*(entry_r0 + 4) = r0_16
return CReliableTCPConnectionIPV6::Connect(r0_16, *g_pServerHostname) __tailcall
