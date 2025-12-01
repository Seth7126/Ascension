// 函数: _ZN9ascension6CWorld18GetPlayedHeroCountENS_12ECardFactionEPN4core13CCardInstanceES4_
// 地址: 0xf86a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r4 = *(arg1 + 0xb80)
int32_t r1 = *(arg1 + 0xb84)
ascension::CPlayer* r6 = arg1
int32_t result

if (r1 == r4)
    result = 0
else
    result = 0
    
    do
        if ((zx.d(r4[1].b) & 1) == 0)
            void* r2 = *r4
            
            if (r2 != 0 && r2 != arg3 && *(*(r2 + 0xc) + 0x88) == 1)
                int32_t r0_3 = ascension::CWorld::QueryCardFaction(r6, *(r6 + 0xb20), r2)
                r1 = *(r6 + 0xb84)
                result += r0_3
        
        r4 = &r4[2]
    while (r4 != r1)

void* r4_1 = *(r6 + 0xb20)

if (r4_1 != 0)
    int32_t* r6_1 = *(r4_1 + 0x48)
    int32_t r1_2 = *(r4_1 + 0x4c)
    
    if (r6_1 != r1_2)
        do
            void* r0_8 = *(*(*r6_1 + 0x10) + 0xc)
            int32_t r0_5
            
            if (zx.d(*(r0_8 + 0xd8)) == 0)
                r0_5 = 0
            else
                r0_5 = ascension::CCard::IsCardFaction(r0_8)
                r1_2 = *(r4_1 + 0x4c)
            
            result += r0_5
            r6_1 = &r6_1[1]
        while (r6_1 != r1_2)

return result
