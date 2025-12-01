// 函数: _ZN14ascensionrules33CStateProcessChooseFactionForCard10EnterStateER13CStateMachine
// 地址: 0x1511dc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r1 = *(arg1 + 0x24c)
ascension::CPlayer* r6 = *(r1 + 4)

if (ascension::CWorld::QueryCardFaction(r6, r1, *(arg1 + 0x250)) == 0)
    int32_t var_24_1 = 1
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa090, "Enlightened", 
        ascensionrules::CStateProcessChooseFactionForCard::SelectFaction)

if (ascension::CWorld::QueryCardFaction(r6, *(arg1 + 0x24c), *(arg1 + 0x250)) == 0)
    int32_t var_24_2 = 2
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa091, "Lifebound", 
        ascensionrules::CStateProcessChooseFactionForCard::SelectFaction)

if (ascension::CWorld::QueryCardFaction(r6, *(arg1 + 0x24c), *(arg1 + 0x250)) == 0)
    int32_t var_24_3 = 3
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa092, "Mechana", 
        ascensionrules::CStateProcessChooseFactionForCard::SelectFaction)

if (ascension::CWorld::QueryCardFaction(r6, *(arg1 + 0x24c), *(arg1 + 0x250)) == 0)
    int32_t var_24_4 = 4
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa093, "Void", 
        ascensionrules::CStateProcessChooseFactionForCard::SelectFaction)

*(arg1 + 0x24c)
jump(*(*arg1 + 0x34))
