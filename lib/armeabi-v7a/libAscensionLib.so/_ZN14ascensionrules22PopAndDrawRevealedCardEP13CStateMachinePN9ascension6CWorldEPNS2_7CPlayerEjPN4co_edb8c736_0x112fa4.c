// 函数: _ZN14ascensionrules22PopAndDrawRevealedCardEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x112fa4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (zx.d(*(arg6 + (arg4 << 5) + 0x10)) != 0)
    int32_t r0_3 = core::CWorldBase::GetInstanceByID(arg2)
    
    if (r0_3 != 0)
        uint32_t r0_4 = __dynamic_cast(r0_3, _typeinfo_for_core::CInstance, 
            _typeinfo_for_core::CCardInstance, 0)
        
        if (r0_4 != 0)
            int32_t var_28_1 = 0
            ascension::CWorld::OutputAnimationCard(arg2, r0_4, 0xa, 0xc, 0, 2, zx.d(*(arg3 + 8)), 0)
            ascension::CWorld::PopRevealCard(arg2)

ascensionrules::CreateStateProcessDrawCards(arg3, 1, nullptr, 0)
return CStateMachine::PushListState(arg1) __tailcall
