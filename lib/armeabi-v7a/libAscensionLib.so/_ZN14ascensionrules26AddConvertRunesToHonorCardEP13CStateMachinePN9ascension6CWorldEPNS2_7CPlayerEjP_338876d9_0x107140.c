// 函数: _ZN14ascensionrules26AddConvertRunesToHonorCardEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x107140
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r2

if (arg7 != 0 && *(arg7 + 4) == 0x17 && *(arg2 + 0x30) u>= 4)
    r2 = *(arg7 + 0x50)

uint32_t r2_1

if (arg7 == 0 || *(arg7 + 4) != 0x17 || *(arg2 + 0x30) u< 4 || r2 == 0)
    r2_1 = zx.d(*(arg5 + 8))
    
    if (r2_1 == 0)
        return 
else
    r2_1 = zx.d(*(r2 + 8)) + 0x7000

return ascension::CWorld::AddConvertRunesToHonorCard(arg2, r2_1) __tailcall
