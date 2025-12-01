// 函数: _ZN14ascensionrules39GainRunesForEachApprenticeAlreadyPlayedEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x105dec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r6 = *(arg2 + 0xb80)
int32_t r8 = *(arg2 + 0xb84)
int32_t r7 = 0

if (r6 != r8)
    do
        if ((zx.d(r6[1].b) & 1) == 0)
            void* r0_3 = *r6
            
            if (r0_3 != 0)
                void* r0_4 = *(r0_3 + 0xc)
                
                if (*(r0_4 + 0x88) == 1 && *(r0_4 + 0x8c) == 0
                        && strcasecmp(r0_4 + 0x44, "Apprentice") == 0)
                    r7 += 1
        
        r6 = &r6[2]
    while (r8 != r6)

core::CInstance* r7_1 = r7 * arg4
ascension::CWorld::OutputAnimationRune(arg2, r7_1, arg5)
ascension::CWorld::AddCurrentTurnRunes(arg2)
return core::CWorldBase::OutputMessageFormat(arg2, "%s gains %d runes\n", (*(*arg3 + 0xc))(arg3), 
    r7_1) __tailcall
