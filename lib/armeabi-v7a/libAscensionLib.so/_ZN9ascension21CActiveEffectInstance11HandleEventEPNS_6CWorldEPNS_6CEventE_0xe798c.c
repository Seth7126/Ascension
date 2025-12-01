// 函数: _ZN9ascension21CActiveEffectInstance11HandleEventEPNS_6CWorldEPNS_6CEventE
// 地址: 0xe798c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = *(arg1 + 0xc)
void* entry_r2
int32_t result = (*(*r0 + 0xc))(r0, arg2, arg1, entry_r2)
int32_t r0_1 = *(arg1 + 0x18)

if (r0_1 != 0)
    void* __offset(ascension::CWorld, 0x60) r7_1 = arg1 + 0x60
    int32_t r6_1 = 0
    
    do
        int32_t r4_1 = *(r7_1 - 4)
        
        if (r4_1 != 0)
            if (r4_1(arg2, arg1, entry_r2, *r7_1) != 0)
                uint32_t r0_4 = zx.d(*(entry_r2 + 0xa))
                *(entry_r2 + 0xa) = r0_4.w + 1
                *(entry_r2 + (r0_4 << 2) + 0x2c) = arg1
                break
            
            r0_1 = *(arg1 + 0x18)
        
        r6_1 += 1
        r7_1 += 0x48
    while (r6_1 u< r0_1)

return result
