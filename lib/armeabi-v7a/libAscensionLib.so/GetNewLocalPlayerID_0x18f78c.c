// 函数: GetNewLocalPlayerID
// 地址: 0x18f78c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = 0xffffffff
uint32_t r0 = *s_pWorldData
int32_t r4 = *(r0 + 0x124)
int32_t r2_1

if (r4 != 0)
    r2_1 = *(r0 + 0xfc)

int32_t* r9

if (r4 == 0 || r2_1 s< 0)
    r9 = nullptr
    r4 = 0
else
    r9 = *(r0 + 0x130)
    r1 = r2_1

int32_t r2_2 = *(r0 + 0x158)

if (r2_2 != 0)
    int32_t r3_1 = *(r0 + 0x100)
    
    if (r3_1 s> r1)
        r9 = *(r0 + 0x164)
        r4 = r2_2
        r1 = r3_1

int32_t r2_3 = *(r0 + 0x18c)

if (r2_3 != 0)
    int32_t r3_2 = *(r0 + 0x104)
    
    if (r3_2 s> r1)
        r9 = *(r0 + 0x198)
        r4 = r2_3
        r1 = r3_2

int32_t r2_4 = *(r0 + 0x1c0)

if (r2_4 != 0 && *(r0 + 0x108) s> r1)
    r9 = *(r0 + 0x1cc)
    r4 = r2_4

void* const r6 = nullptr
void* const r7 = nullptr

if (*(r4 + 0x1c) != *(r4 + 0x18))
    int32_t r5_1 = 0
    r7 = nullptr
    
    while (true)
        r6 = ascension::CWorld::GetPlayer(r4)
        int32_t* r0_5 = *s_pWorldData + 0x14
        int32_t i
        
        do
            i = *r0_5
            r0_5 = &r0_5[0xc]
        while (i != *(r6 + 0xc))
        
        if (zx.d(*(r0_5 - 0x28)) u<= 1)
            int32_t* r0_7 = *r9
            
            if (r7 == 0)
                r7 = r6
            
            if (r0_7 != 0 && (*(*r0_7 + 0x18))() != 0)
                break
        
        r5_1 += 1
        
        if (r5_1 u>= (*(r4 + 0x1c) - *(r4 + 0x18)) s>> 2)
            r6 = nullptr
            break

if (r6 != 0)
    r7 = r6

return *(r7 + 0xc)
