// 函数: _ZN14ascensionrules41TriggerMarkAcquireEventForRallyEffectDataEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11bf84
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *(arg4 + 4)

if (r0 != 0x12)
    return r0

void* r0_1 = *(arg4 + 0x64)

if (r0_1 != 0)
    r0_1 = *(r0_1 + 4)
    
    if (r0_1 == 0x11)
        r0_1 = ascension::CCardInPlayInstance::GetEffectData(arg3)
        
        if (r0_1 != 0)
            void* r1_1 = *(arg4 + 0x64)
            r0_1 = *(r1_1 + 0x58) | 1 << (r0_1 & 0xff)
            *(r1_1 + 0x58) = r0_1

return r0_1
