// 函数: GetGamePlayerAIState
// 地址: 0x18a240
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0 = *s_pWorldData
int32_t r2_1

if (r0 != 0)
    r2_1 = *(r0 + 0xd4)

int32_t r0_1

if (r0 == 0 || r2_1 s< 1)
label_18a294:
    r0_1 = 0
    *arg2 = 0
    arg2[1] = 0
else
    int32_t* r3_1 = r0 + 0x14
    int32_t r4_1 = 0
    
    while (*r3_1 != arg1)
        r4_1 += 1
        r3_1 = &r3_1[0xc]
        
        if (r4_1 s>= r2_1)
            goto label_18a294
    
    *arg2 = arg1
    int32_t r0_4 = *(r0 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
    void* r0_5
    
    if (r0_4 != 0)
        r0_5 = ascension::CWorld::GetPlayerByIndex(r0_4)
    
    if (r0_4 == 0 || r0_5 == 0)
        r0_1 = 0
        arg2[1] = 0
    else
        void* r0_6 = *(r0_5 + 0x30)
        
        if (r0_6 == 0)
            arg2[1] = 0
            arg2[2] = 0
            return 0xc
        
        arg2[1].w = 1
        *(arg2 + 6) = zx.w(*(r0_6 + 8))
        r0_1 = *(r0_6 + 0xc)

arg2[2] = r0_1
return 0xc
