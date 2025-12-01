// 函数: _ZN14ascensionrules24ReplaceSeventhCenterCardEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x11288c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CWorld::SetCenterRowSize(arg2)
uint32_t i_2 = ascension::CWorld::RemoveCenterRowCard(arg2, true)

if (i_2 != 0)
    uint32_t i_1 = i_2
    uint32_t i
    
    do
        int32_t var_40_1 = 0
        ascension::CWorld::OutputAnimationCard(arg2, i_1, 6, 7, 6, 9, 0, 
            &(*__elf_header.ident.signature)[1])
        ascension::CWorld::PutCardInVoid(arg2)
        i = ascension::CWorld::RemoveCenterRowCard(arg2, true)
        i_1 = i
    while (i != 0)

ascensionrules::CreateStateRemoveCenterRowCard(arg3, 6, nullptr, true, false, 0, 0, false, nullptr, 
    nullptr, 0, nullptr, 0)
return CStateMachine::PushListState(arg1) __tailcall
