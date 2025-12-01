// 函数: _ZN14ascensionrules38GainHonorEqualToRevealedCardHonorValueEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1127f4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result = arg6 + (arg4 << 5)

if (zx.d(*(result + 0x10)) != 0)
    result = core::CWorldBase::GetInstanceByID(arg2)
    
    if (result != 0)
        result = *(result + 0xc)
        int32_t r7_1 = *(result + 0xa4)
        
        if (r7_1 s>= 1)
            ascensionrules::CreateStateGainHonor(arg3, arg5, r7_1, true, nullptr, 0)
            CStateMachine::PushListState(arg1)
            int32_t var_28_1 = 0
            return ascension::CWorld::OutputEvent(arg2, 0xc, zx.d(*(arg3 + 8)), r7_1)

return result
