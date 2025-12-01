// 函数: _ZN9ascension21CActiveEffectInstance14HandleDurationEPNS_6CWorldEPNS_6CEventE
// 地址: 0xe78d4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *(arg1 + 0x18)

if (r0 == 0)
    return 0

void* __offset(ascension::CWorld, 0x5c) r7 = arg1 + 0x5c
int32_t r4 = 0

do
    int32_t r6_1 = *r7
    
    if (r6_1 != 0)
        void* entry_r2
        
        if (r6_1(arg2, arg1, entry_r2, *(r7 + 4)) != 0)
            uint32_t r0_5 = zx.d(*(entry_r2 + 0xa))
            *(entry_r2 + 0xa) = r0_5.w + 1
            *(entry_r2 + (r0_5 << 2) + 0x2c) = arg1
            return 1
        
        r0 = *(arg1 + 0x18)
    
    r4 += 1
    r7 += 0x48
while (r4 u< r0)

return 0
