// 函数: _ZN22CReliableUDPConnectionD1Ev
// 地址: 0xba670
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void** entry_r0
*entry_r0 = _vtable_for_CReliableUDPConnection + 8
CReliableUDPConnection::Shutdown()

if (entry_r0[0x10] != 0)
    int32_t* i_2 = entry_r0[0xf]
    void* r1_1 = entry_r0[0xe]
    void* r2_1 = *i_2
    *(r2_1 + 4) = *(r1_1 + 4)
    **(r1_1 + 4) = r2_1
    entry_r0[0x10] = 0
    
    if (i_2 != &entry_r0[0xe])
        int32_t* i
        
        do
            i = i_2[1]
            operator delete(i_2)
            i_2 = i
        while (i != &entry_r0[0xe])

if (entry_r0[0xd] == 0)
    return 

int32_t* i_3 = entry_r0[0xc]
void* r1_3 = entry_r0[0xb]
void* r2_2 = *i_3
*(r2_2 + 4) = *(r1_3 + 4)
**(r1_3 + 4) = r2_2
entry_r0[0xd] = 0

if (i_3 == &entry_r0[0xb])
    return 

int32_t* i_1

do
    i_1 = i_3[1]
    operator delete(i_3)
    i_3 = i_1
while (i_1 != &entry_r0[0xb])
